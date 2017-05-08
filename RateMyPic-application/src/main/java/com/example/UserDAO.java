package com.example;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bajtek on 03.05.2017.
 */
@Repository
public class UserDAO {

    List<User> users = new ArrayList<User>();

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUserById(int id) {
        if(id < users.size()) {
            return users.get(id);
        }
        else {
            return null;
        }
    }
}
