public class text6 {
    public static void main(String[] args) {
        A a=new A();
        A a1=new A();
        B b=new B();
        b.Info(); //3
//        System.out.println(A.i);
    }
}
class A{
    private static  int i;
    public static int count;
    public A(){
        count++;
    }
}
class B extends A{
    public void Info(){
        System.out.println(count);
    }
}
