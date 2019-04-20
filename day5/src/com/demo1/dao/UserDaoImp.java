package com.demo1.dao;

import com.demo1.bean.UserBean;
import com.demo1.exception.MyException;

public class UserDaoImp implements UserDao {
    @Override
    public void login(UserBean u) {
        if("admin".equals(u.getUserName())&&"1234".equals(u.getPwd())){
            System.out.println("登陆成功");
        }else{
//            System.out.println("用户名或密码错误");
            MyException myException = new MyException("用户名或密码错误！");
            throw myException;
        }
    }
}
