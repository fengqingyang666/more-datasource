package com.atjack.serviceimpl;

import com.atjack.bean.User;
import com.atjack.dao.master.UserDao;
import com.atjack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yjack
 * @Des
 * @date 12/23/21 9:12 AM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findByName(String userName) {
        return userDao.findByName(userName);
    }
}
