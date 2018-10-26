package com.vito16.shop.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author 朱鑫龙
 * @version 2018/10/11
 */
@Setter
@Getter
public class OrderBase implements Serializable {

    /**
     * 请求流水号
     */
    private String reqId;


}
