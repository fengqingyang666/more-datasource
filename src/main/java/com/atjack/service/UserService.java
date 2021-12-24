package com.atjack.service;

import com.atjack.bean.User;

/**
 * @author yjack
 * @Des
 * @date 12/23/21 9:11 AM
 */
public interface UserService {

    User findByName(String userName);
}
