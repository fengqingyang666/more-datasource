package com.atjack.dao.slave;

import com.atjack.bean.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yjack
 * @Des
 * @date 12/23/21 9:06 AM
 */
@Mapper
@Repository
public interface CityDao {

    City findByName(String cirtName);

    List<City> findAll();
}
