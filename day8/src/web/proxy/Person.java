package web.proxy;

public class Person implements IFly,IShopping{
    @Override
    public void fly() {
        System.out.println("我是fly");
    }

    @Override
    public void buy() {
        System.out.println("购物!!");
    }
}
