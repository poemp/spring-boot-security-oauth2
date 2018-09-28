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

    /**
     *
     * @param user
     * @return
     */
    boolean isUserExist(User user);

    /**
     *
     * @param user
     */
    void saveUser(User user);

    /**
     *
     * @param currentUser
     */
    void updateUser(User currentUser);

    /**
     *
     * @param id
     */
    void deleteUserById(long id);

    /**
     *
     */
    void deleteAllUsers();

}
