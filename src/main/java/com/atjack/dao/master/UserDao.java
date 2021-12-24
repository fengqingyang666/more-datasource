package com.atjack.dao.master;

import com.atjack.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yjack
 * @Des
 * @date 12/23/21 9:05 AM
 */
@Mapper
@Repository
public interface UserDao {

    User findByName(String userName);

    List<User> findAll();

    List<User> selectAll();

}
