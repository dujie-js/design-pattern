package com.js.statemachine.service;

import com.js.statemachine.entity.StatemachineConfig;
import com.js.statemachine.mapper.StatemachineConfigMapper;

import java.util.List;

public interface StatemachineConfigService {

    StatemachineConfigMapper getStatemachineConfigMapper();

    /**
     * 根据id查询
     **/
    StatemachineConfig findById(Long id);

    /**
     * 条件查询
     **/
    List<StatemachineConfig> find(StatemachineConfig statemachineConfig);

    /**
     * 插入新数据
     **/
    int insert(StatemachineConfig statemachineConfig);

    /**
     * 批量插入
     **/
    int batchInsert(List<StatemachineConfig> list);

    /**
     * 根据id修改数据
     **/
    int updateById(StatemachineConfig statemachineConfig);

    /**
     * 批量修改暂时不好用
     **/
    int updateBatch(List<StatemachineConfig> list);

    /**
     * 根据id删除
     **/
    int deleteById(Long id);

    /**
     * 通过条件删除数据
     **/
    int deleteByEntity(StatemachineConfig statemachineConfig);

    /**
     * 通过ID批量删除数据除数据
     **/
    int deleteByIds(List<Long> list);

    /**
     * 条件查询总数
     **/
    int countByEntity(StatemachineConfig statemachineConfig);
}