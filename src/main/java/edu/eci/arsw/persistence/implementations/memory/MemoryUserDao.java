package edu.eci.arsw.persistence.implementations.memory;

import edu.eci.arsw.persistence.models.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import edu.eci.arsw.persistence.contracts.IUserDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
@Qualifier("MemoryUserDao")
public class MemoryUserDao implements IUserDao {

    private List<User> users = new ArrayList<>();

    public MemoryUserDao() {
        users.add(new User(UUID.randomUUID(), "John", "john@domain.com"));
        users.add(new User(UUID.randomUUID(), "Susan", "susan@domain.com"));
    }

    @Override
    public Optional<User> get(UUID id) {
        return users.stream().filter(u -> id.equals(u.getId())).findFirst();
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(UUID id, User user) {
        users = users.stream()
                .map(u -> id.equals(u.getId()) ? user : u)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(UUID id) {
        users.removeIf(u -> id.equals(u.getId()));
    }
}
