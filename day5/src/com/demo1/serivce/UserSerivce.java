package com.demo1.serivce;

import com.demo1.bean.UserBean;
import com.demo1.dao.UserDaoImp;

import java.util.Scanner;

public class UserSerivce {
    public static void main(String[] args) {
        UserDaoImp userDaoImp=new UserDaoImp();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username=sc.next();
        System.out.println("请输入密码");
        String pwd=sc.next();
        UserBean u=new UserBean();
        u.setUserName(username);
        u.setPwd(pwd);
        userDaoImp.login(u);
    }
}
