package edu.eci.arsw.persistence.implementations.memory;

import edu.eci.arsw.persistence.models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import edu.eci.arsw.persistence.contracts.IUserDao;

import java.util.List;


@SpringBootTest
public class TestMemoryUserDao {

    @Autowired
    @Qualifier("MemoryUserDao")
    private IUserDao userDao;

    @Test
    public void shouldGetAll() {

        List<User> users = userDao.getAll();

        Assertions.assertNotNull(users);
        Assertions.assertEquals(2, users.size());
    }

}
