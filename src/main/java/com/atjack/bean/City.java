package com.atjack.bean;

import lombok.Data;

/**
 * @author yjack
 * @Des
 * @date 12/23/21 9:02 AM
 */
@Data
public class City {

    private int id;

    private int provinceId;

    private String cityName;

    private String description;
}
