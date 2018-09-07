package org.poem.api;

import org.poem.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User findById(long id);

    boolean isUserExist(User user);

    void saveUser(User user);

    void updateUser(User currentUser);

    void deleteUserById(long id);

    void deleteAllUsers();

}
