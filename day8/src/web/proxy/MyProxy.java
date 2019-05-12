package web.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {
    private Object target;
    public MyProxy(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target , args);
    }
}
