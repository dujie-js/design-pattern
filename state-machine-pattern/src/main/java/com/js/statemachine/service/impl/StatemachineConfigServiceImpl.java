package com.js.statemachine.service.impl;

import com.js.statemachine.entity.StatemachineConfig;
import com.js.statemachine.mapper.StatemachineConfigMapper;
import com.js.statemachine.service.StatemachineConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatemachineConfigServiceImpl implements StatemachineConfigService {

    @Autowired
    private StatemachineConfigMapper statemachineConfigMapper;

    @Override
    public StatemachineConfigMapper getStatemachineConfigMapper() {
        return statemachineConfigMapper;
    }

    @Override
    public StatemachineConfig findById(Long id) {
        return statemachineConfigMapper.findById(id);
    }

    @Override
    public List<StatemachineConfig> find(StatemachineConfig statemachineConfig) {
        return statemachineConfigMapper.find(statemachineConfig);
    }

    @Override
    public int insert(StatemachineConfig statemachineConfig) {
        return statemachineConfigMapper.insert(statemachineConfig);
    }

    @Override
    public int batchInsert(List<StatemachineConfig> list) {
        return statemachineConfigMapper.batchInsert(list);
    }

    @Override
    public int updateById(StatemachineConfig statemachineConfig) {
        return statemachineConfigMapper.updateById(statemachineConfig);
    }

    @Override
    public int updateBatch(List<StatemachineConfig> list) {
        return statemachineConfigMapper.updateBatch(list);
    }

    @Override
    public int deleteById(Long id) {
        return statemachineConfigMapper.deleteById(id);
    }

    @Override
    public int deleteByEntity(StatemachineConfig statemachineConfig) {
        return statemachineConfigMapper.deleteByEntity(statemachineConfig);
    }

    @Override
    public int deleteByIds(List<Long> list) {
        return statemachineConfigMapper.deleteByIds(list);
    }

    @Override
    public int countByEntity(StatemachineConfig statemachineConfig) {
        return statemachineConfigMapper.countByEntity(statemachineConfig);
    }

}