package com.js.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class CouponContext {
    @Autowired
    private Map<String, CouponStrategy> couponStrategyConcurrentHashMap;

    @Autowired
    private List<CouponStrategy> couponStrategyList;

    public void selectStrategy(Integer status) {
        CouponStrategy couponStrategy = couponStrategyConcurrentHashMap.get(String.valueOf(status));
        if (!ObjectUtils.isEmpty(couponStrategy)) {
            couponStrategy.discount();
        }
    }

    public void findStrategy(Integer status) {
        Optional<CouponStrategy> first = couponStrategyList.stream().filter(couponStrategy -> couponStrategy.isSupport(status)).findFirst();
        if (first.isPresent()) {
            first.get().discount();
        }
    }
}