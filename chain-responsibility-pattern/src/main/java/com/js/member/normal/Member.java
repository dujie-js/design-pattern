package com.js.member.normal;

public class Member {
    private String loginName;

    private String loginPass;

    private String roleName;

    public Member(String loginName, String loginPass) {
        this.loginName = loginName;
        this.loginPass = loginPass;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"loginName\":\"")
                .append(loginName).append('\"');
        sb.append(",\"loginPass\":\"")
                .append(loginPass).append('\"');
        sb.append(",\"roleName\":\"")
                .append(roleName).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
