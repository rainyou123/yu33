package web.proxy;

import java.lang.reflect.Proxy;
//动态代理类 （以下简称为代理类 ）是一个实现在类创建时在运行时指定的接口列表的类，
// 具有如下所述的行为。 代理接口是由代理类实现的接口。 代理实例是代理类的一个实例。
// 每个代理实例都有一个关联的调用处理程序对象，它实现了接口InvocationHandler 。
// 通过其代理接口之一的代理实例上的方法调用将被分派到实例调用处理程序的invoke方法，
// 传递代理实例， java.lang.reflect.Method被调用方法的java.lang.reflect.Method对象以及包含参数的类型Object Object的数组。
// 调用处理程序适当地处理编码方法调用，并且返回的结果将作为方法在代理实例上调用的结果返回。


public class Test {
    public static void main(String[] args) {
        Person p=new Person();
        MyProxy proxy=new MyProxy(p);
        IFly iFly = (IFly) Proxy.newProxyInstance(p.getClass().getClassLoader(), p.getClass().getInterfaces(), proxy);
        //p.getClass().getInterfaces()得到代理类实现的接口列表
        iFly.fly();
        IShopping iShopping = (IShopping) Proxy.newProxyInstance(p.getClass().getClassLoader(), p.getClass().getInterfaces(), proxy);
        iShopping.buy();
//        p.fly();
    }
//    @Test
//    public void x(){}
}
