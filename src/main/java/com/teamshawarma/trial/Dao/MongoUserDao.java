package com.teamshawarma.trial.Dao;

import com.teamshawarma.trial.Entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by Kiela on 2/6/2017.
 */

@Repository
@Qualifier("mongoData")
public class MongoUserDao implements UserDao {
    @Override
    public Collection<User> getAllUsers() {
        return null;
    }

    @Override
    public void deleteStudentById(long id) {

    }

    @Override
    public void updateUserById(User u) {

    }

    @Override
    public void addUser(User u) {

    }
}
