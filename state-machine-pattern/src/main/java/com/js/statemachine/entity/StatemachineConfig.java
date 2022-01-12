package com.js.statemachine.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
/**
 * (StatemachineConfig)实体类
 *
 * @author 渡劫 dujie
 * @since 2021-12-16 13:53:08
 */
@Data
public class StatemachineConfig {
    
    private Long id;
    /**
     * 状态机名称
     */
    private String name;
    /**
     * 渠道编码
     */
    private String channelCode;
    /**
     * 源状态
     */
    private Integer source;
    /**
     * 目标状态
     */
    private Integer target;
    /**
     * 触发事件
     */
    private Integer event;
    /**
     * 要执行的行为
     */
    private String action;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    /**
     * 删除标识 0 未删除 1 已删除
     */
    private Integer delFlag;

}