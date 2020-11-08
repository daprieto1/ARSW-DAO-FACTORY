package edu.eci.arsw.persistence.contracts;

import edu.eci.arsw.persistence.models.User;
import edu.eci.arsw.persistence.DAO;

import java.util.UUID;

public interface IUserDao extends DAO<UUID,User> {



}
