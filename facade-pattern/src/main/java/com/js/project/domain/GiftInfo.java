package com.js.project.domain;

/**
 * @Description: 创建礼品类
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/4/29 1:39 PM
 * @return
 */
public class GiftInfo {
    private String name;

    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public GiftInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"password\":\"")
                .append(password).append('\"');
        sb.append('}');
        return sb.toString();
    }

}
