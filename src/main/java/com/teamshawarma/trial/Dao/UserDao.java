package com.teamshawarma.trial.Dao;

import com.teamshawarma.trial.Entity.User;

import java.util.Collection;

/**
 * Created by Kiela on 2/6/2017.
 */
public interface UserDao {
    Collection<User> getAllUsers();

    void deleteStudentById(long id);

    void updateUserById(User u);

    void addUser(User u);
}
