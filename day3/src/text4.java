public class text4 {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person();
        Person p3=new Person();
        System.out.println(p1.count);
    }
}
class Person{
    public static int count;
    //    private static int count;
    private String name;
    public Person(){
        count++;
    }
}
