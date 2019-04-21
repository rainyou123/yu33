package com.demo1.exception;
//自定义异常 继承于非受检异常类RuntimeException
public class MyException extends RuntimeException{
    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }
}
