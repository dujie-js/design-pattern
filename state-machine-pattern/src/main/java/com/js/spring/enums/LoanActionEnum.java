package com.js.spring.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LoanActionEnum {
    WAIT_PAYMENT(1, OrderStatus.WAIT_PAYMENT),
    WAIT_DELIVER(2, OrderStatus.WAIT_DELIVER),
    WAIT_RECEIVE(3, OrderStatus.WAIT_RECEIVE),
    FINISH(4, OrderStatus.FINISH);;
    private int code;

    private OrderStatus orderStatus;

    public static OrderStatus getOrder(int query) {
        for (LoanActionEnum value : LoanActionEnum.values()) {
            if (query == value.getCode()) {
                return value.getOrderStatus();
            }
        }
        return LoanActionEnum.WAIT_PAYMENT.getOrderStatus();
    }
}
