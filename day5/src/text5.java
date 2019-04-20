public class text5 {
    public static void main(String[] args) {
        String s1="飞";
        String s2="飞";
        System.out.println(s1==s2);//true 常量池
        String s3=new String("飞");
        String s4=new String("飞");
        System.out.println(s3==s4);//false 两个对象
        String s5="a";
        String s6=s5+1;
        String s7="a1";
        System.out.println(s6==s7);//false s5无法在编译时确定
        final String s8="a";
        String s9=s8+1;
        System.out.println(s9==s7);//true s8是常量在编译器不可更改，可以在编译期确定
        String a=get();
        String b=a+1;
        String c="a1";
        System.out.println(b==c);//false 方法只有运行期才知道


    }
    public static String get(){
        return "a";
    }
}
