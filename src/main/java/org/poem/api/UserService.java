package org.poem.api;

import org.poem.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    /**
     *
     * @return
     */
    List<User> findAllUsers();

    /**
     *
     * @param id
     * @return
     */
    User findById(long id);

    boolean isUserExist(User user);

    void saveUser(User user);

    void updateUser(User currentUser);

    void deleteUserById(long id);

    void deleteAllUsers();

}
