package org.poem.service;

import org.poem.vo.UserVO;
import org.springframework.stereotype.Service;

/**
 * @author poem
 */
@Service
public class IUserService {


    /**
     * 查询数据
     * @param username
     * @return
     */
    public UserVO findByUserName(String username) {
        UserVO userVO = new UserVO();
        userVO.setUserName(username);
        userVO.setPassword("root");
        return userVO;
    }
}
