package com.teamshawarma.trial.Service;

import com.teamshawarma.trial.Dao.FakeUserDao;
import com.teamshawarma.trial.Dao.UserDao;
import com.teamshawarma.trial.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Brian on 2/6/2017.
 * Contains all business logic while using Dao to access objects
 *
 */
@Service
public class UserService {
    @Autowired
    @Qualifier("mongoData")
    private UserDao userDao;

    public Collection<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    public void deleteStudentById(long id) {
        userDao.deleteStudentById(id);
    }

    public void updateUser(User u ){
        userDao.updateUserById(u);
    }

    public void addUser(User u) {
        userDao.addUser(u);
    }
}
