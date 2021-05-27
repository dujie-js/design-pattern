package com.js.member.normal;

import org.springframework.util.StringUtils;

public class MemberService {

    public void login(String loginName, String loginPass){
        if (StringUtils.isEmpty(loginName) || StringUtils.isEmpty(loginPass)){
            System.out.println("输入的数据不可以为空");
            return;
        }
        Member member = checkExist(loginName,loginPass);
        if (null == member){
            System.out.println("用户的信息为空");
            return;
        }
        System.out.println("用户登录成功");
        if(!"管理员".equals(member.getRoleName())){
            System.out.println("您不是管理员");
            return;
        }
        System.out.println("可以操作");
    }

    private Member checkExist(String loginName, String loginPass) {
        Member member = new Member(loginName,loginPass);
        member.setRoleName("管理员");
        return member;
    }

    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("tom","666");
    }
}
