public class text3 {
    public static void main(String[] args) {
        Animal b=new Bird();
        Animal p=new Pig();//自动转换
        //向上转型 把pig类--->animal类 可自动转换
        Pig pp=new Pig();
        p = (Animal)pp;
        //向下转型  把animal类--->pig类 强行转换
        pp=(Pig)p;
        function(p);
        System.out.println("-----------------");
        function(b);
    }
    public static void function(Animal a){//把进来的自动向上转型成最大父类
        //只判断两个的原因，因为Animal只有两个子类，要是有多个还要判断多个
        if(a instanceof Pig){
            ((Pig) a).sleep();
            a.eat();
        }else if(a instanceof Bird){
            ((Bird) a).fly();
        }
    }
}
abstract class Animal{
    public abstract void eat();
}
class Pig extends Animal{
    public void sleep(){
        System.out.println("爱睡觉");
    }
    @Override
    public void eat() {
        System.out.println("吃糙米");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("飞...");
    }
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }
}
