package org.poem.impl;

import org.poem.api.UserService;
import org.poem.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public boolean isUserExist(User user) {
        return false;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User currentUser) {

    }

    @Override
    public void deleteUserById(long id) {

    }

    @Override
    public void deleteAllUsers() {

    }
}
