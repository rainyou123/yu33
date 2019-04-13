class Root{
    static {
        System.out.println("Root静态初始化块");
    }
    {
        System.out.println("Root普通初始化块");
    }
//    public Root(String a ){
//        System.out.println("Root有参"+a);
//
//    }
    public Root(){
        System.out.println("Root无参的构造函数");
    }
}
class Mid extends Root{
    static {
        System.out.println("Mid的静态初始化快");
    }
    {
        System.out.println("Mid的普通初始化快");
    }
//    public Mid(){
//        System.out.println("Mid无参的构造函数");
//    }
    public Mid(String a){
        //this();
//        super(a);
        System.out.println("Mid的带参构造函数，其值为"+a);
    }
}
class Leaf extends Mid{
    static{
        System.out.println("Leaf的静态初始化快");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }
    public Leaf(){
        super("嘿");
        System.out.println("执行leaf构造器");
    }
}
public class text1{
    public static void main(String[] args) {
        new Leaf();
    }
}
