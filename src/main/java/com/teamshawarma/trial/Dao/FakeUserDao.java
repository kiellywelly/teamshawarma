package com.teamshawarma.trial.Dao;

import com.teamshawarma.trial.Entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Brian on 2/6/2017.
 *
 */
@Repository
@Qualifier("fakeData")
public class FakeUserDao implements UserDao {

    private static Map<Long, User> users;

    static {
        users = new HashMap<Long, User>(){
            {
                put((long) 1, new User((long) 1, "Kiela", "mokimoki", (double) 4.0));
                put((long) 2, new User((long) 2, "Brian", "coolcars", (double) 3.0));
                put((long) 3, new User((long) 3, "Kaira", "nailpolish", (double) 3.0));
            }
        };

    }
    @Override
    public Collection<User> getAllUsers(){
        return this.users.values();
    }

    @Override
    public void deleteStudentById(long id) {
        this.users.remove(id);
    }

    @Override
    public void updateUserById(User u) {
        User user = users.get(u.getId());
        user.setName(u.getName());
        user.setAveGrade(u.getAveGrade());
        users.put(u.getId(), u);
    }

    @Override
    public void addUser(User u) {
        this.users.put(u.getId(), u);
    }
}
