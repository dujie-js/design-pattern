package com.js.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description 处理器Bean枚举
 */
@Getter
@AllArgsConstructor
public enum HandlerBeanEnum {

    AHandler("aHandler"),
    BHandler("bHandler"),
    CHandler("cHandler");

    private String beanName;
}