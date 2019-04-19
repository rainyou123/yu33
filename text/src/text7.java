public class text7 {
    public static void main(String[] args) {
        Animal a1=new Cat();
        Animal a2=new Pig();
        Pig p=new Pig();
        a2=(Animal)p;
        p=(Pig) a2;
        function(a1);
        System.out.println("--------------------------------------------");
        function(a2);
    }
    public static void function(Animal a){
        if(a instanceof Pig){
            ((Pig) a).sleep();
            a.eat();
        }else if(a instanceof Cat){
            ((Cat) a).play();
            a.eat();
        }
    }
}
abstract class Animal{
//    public static final int NUM=2;//常量
    public abstract void eat();
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
    public void play(){
        System.out.println("玩。。");
    }
}
class Pig extends Animal{
    @Override
    public void eat() {
        System.out.println("吃饲料");
    }
    public void sleep(){
        System.out.println("爱睡觉。。。");
    }
}