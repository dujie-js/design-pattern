package com.js.vo;

/**
 * @Description: 登陆的请求参数
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/7 2:01 PM
 * @return
 */
public class Member {

    private String userName;

    private String password;

    private String mid;

    private String info;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"userName\":\"")
                .append(userName).append('\"');
        sb.append(",\"password\":\"")
                .append(password).append('\"');
        sb.append(",\"mid\":\"")
                .append(mid).append('\"');
        sb.append(",\"info\":\"")
                .append(info).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
