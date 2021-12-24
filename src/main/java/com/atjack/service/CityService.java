package com.atjack.service;

import com.atjack.bean.City;

/**
 * @author yjack
 * @Des
 * @date 12/23/21 9:12 AM
 */
public interface CityService {
    City findByName(String cirtName);
}
