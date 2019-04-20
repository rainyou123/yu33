package com.demo1.bean;
//MVC 模式 Module View Control 分模块设计
public class UserBean {
    private String userName;
    private String pwd;
    public UserBean(){}
    public UserBean(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    @Override
    public String toString() {
        return "UserBean{" +
                "userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
