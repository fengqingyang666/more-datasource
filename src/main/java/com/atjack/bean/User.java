package com.atjack.bean;

import lombok.Data;

/**
 * @author yjack
 * @Des
 * @date 12/23/21 9:02 AM
 */
@Data
public class User {

    private int id;

    private String userName;

    private  String description;

    private City city;
}
