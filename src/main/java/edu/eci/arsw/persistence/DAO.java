package edu.eci.arsw.persistence;

import java.util.List;
import java.util.Optional;

public interface DAO<PK,E> {

    Optional<E> get(PK pk);

    List<E> getAll();

    void save(E e);

    void update(PK pk, E e);

    void delete(PK pk);

}
