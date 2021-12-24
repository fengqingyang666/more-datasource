package com.atjack.controller;

import com.atjack.bean.City;
import com.atjack.bean.User;
import com.atjack.dao.master.UserDao;
import com.atjack.dao.slave.CityDao;
import com.atjack.service.CityService;
import com.atjack.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yjack
 * @Des
 * @date 12/23/21 9:50 AM
 */
@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private CityService cityService;

    @Autowired
    private CityDao cityDao;

    @Autowired
    private UserDao userDao;


    @RequestMapping(value = "/findByName")
    public User findByName(String userName) {

        User user = userService.findByName(userName);

        log.info("===" + user);

        City city = cityService.findByName("北京市");
        user.setCity(city);

        log.info("===" + user);

        return user;
    }

    @RequestMapping("findAllCity")
    public List<City> findAllCity() {

        return cityDao.findAll();
    }

    @RequestMapping(value = "/findAllUser")
    public List<User> findUser() {
        return userDao.findAll();
    }

    @RequestMapping(value = "/selectAll")
    public List<User> selectAll() {
        return userDao.selectAll();
    }
}
