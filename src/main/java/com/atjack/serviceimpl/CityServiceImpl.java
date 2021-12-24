package com.atjack.serviceimpl;

import com.atjack.bean.City;
import com.atjack.dao.slave.CityDao;
import com.atjack.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yjack
 * @Des
 * @date 12/23/21 9:13 AM
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
