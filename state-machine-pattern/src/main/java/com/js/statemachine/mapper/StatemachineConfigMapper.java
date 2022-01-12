package com.js.statemachine.mapper;

import com.js.statemachine.entity.StatemachineConfig;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

/**
 * (StatemachineConfig)表数据库访问层
 *
 * @author 渡劫
 * @since 2021-12-16 13:53:10
 */
@Mapper
public interface StatemachineConfigMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    StatemachineConfig findById(@Param("id") Long id);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param statemachineConfig 实例对象
     * @return 对象列表
     */
    List<StatemachineConfig> find(StatemachineConfig statemachineConfig);

    /**
     * 新增数据
     *
     * @param statemachineConfig 实例对象
     * @return 影响行数
     */
    int insert(StatemachineConfig statemachineConfig);

    /**
     * 批量新增
     *
     * @param statemachineConfigs 实例对象的集合
     * @return 影响行数
     */
    int batchInsert(@Param("statemachineConfigs") List<StatemachineConfig> statemachineConfigs);

    /**
     * 修改数据
     *
     * @param statemachineConfig 实例对象
     * @return 影响行数
     */
    int updateById(StatemachineConfig statemachineConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);

    /**
     * 通过条件删除数据
     *
     * @param statemachineConfig 删除条件
     * @return 影响行数
     */
    int deleteByEntity(StatemachineConfig statemachineConfig);

    /**
     * 通过ID批量删除数据除数据
     *
     * @param list 主键集合
     * @return 影响行数
     */
    int deleteByIds(@Param("list") List<Long> list);

    /**
     * 条件查询总数
     *
     * @return 数据总数
     */
    int countByEntity(StatemachineConfig statemachineConfig);

    /**
     * 批量修改
     *
     * @return 修改成功的条数
     */
    int updateBatch(@Param("list") List<StatemachineConfig> list);

}