//函数式接口(@FunctionalInterface) 里只有一个抽象方法
public class text8 {
    public static void main(String[] args) {
        IEat ie=new IEat() {
            @Override
            public int eat(int age,String a) {
                return age;
            }
        };
//        ie.fly(); 静态在接口中只能让接口调用
        IEat.fly();
        ie.eat(10,"haha");
        //不加{}号的话 就不要写return 要不就写{return age；}；
        IEat ie2=(age,a)->age;
        System.out.println(ie2.eat(5,"ie2"));
    }
}
interface IEat{
    int eat(final int age,String a);
    default void drink(){}
    static void fly(){
        System.out.println("fly...");
    }
}

//public static void main(String[] args) {
//    IEat eat = new IEat() {
//        @Override
//        public int eat(final String name , int age) {
//            System.out.println(name + "eat...apple" + age);
//            return age;
//        }
//    };
//    eat.eat("zs" ,2);
//    IEat eat2 = ( n ,  a) -> a;
//    System.out.println(eat2.eat("ls", 5));
//    IEat.drink();
//}
//}
//@FunctionalInterface
//interface IEat{
//    int eat(final String name , int age);
//    default void move(){
//
//    }
//    static void drink(){
//        System.out.println("drink");
//