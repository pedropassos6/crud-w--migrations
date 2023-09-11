package com.pedro.crud.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
public enum OrderStatus {

    WAITING_PAYMENT,
    PAID,
    SHIPPED,
    DELIVERED,
    CANCELED;

//    private int code;
//
//    public static OrderStatus valueOf(int code){
//        for (OrderStatus value : OrderStatus.values()){
//            if (value.getCode() == code){
//                return value;
//            }
//        }
//        throw new IllegalArgumentException("Invalid OrderStatus code");
//    }




}
