public class text8 {
    public static void main(String[] args) {
        Person p =new Person();
        p.eat();

    }
}
//接口只定义常量和抽象方法
class Person implements DemoI{
    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
class Bird implements DemoI,DemoI1{

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void move() {
        System.out.println("鸟飞、、、");
    }
}
interface DemoI1 extends DemoI{
    void move();
}
interface DemoI{
//    public abstract void eat();
    void eat();
//    public final int Count=10;//必须是常量
    int Count=10;
}
