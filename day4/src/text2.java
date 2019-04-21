public class text2 {
    public static void main(String[] args) {
//        in1 i= new in1() ; 不能执行
        in1 i=new inter();
        i.eat();
    }
}
class inter implements in1,in2{
    @Override
    public void eat() {
        System.out.println("in1的吃");
    }
    @Override
    public void move() {
        System.out.println("in2的移动");
    }

    @Override
    public void smile() {

    }
}
class inter1 implements in1{

    @Override
    public void smile() {

    }

    @Override
    public void eat() {

    }
}
interface in{
    void smile();
}
interface in1 extends in{
//    public abstract void eat();
    void eat();
//    public final int Count=0; 常量
    int Count=0;
}
interface in2 extends in,in1{
    void move();
    default void drink(){}
}

