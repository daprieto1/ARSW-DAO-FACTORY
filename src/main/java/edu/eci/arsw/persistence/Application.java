package edu.eci.arsw.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import edu.eci.arsw.persistence.contracts.IUserDao;

public class Application {

    @Autowired
    private static IUserDao userDao;

    public static void main(String[] args) {

        userDao.getAll();
    }

}

