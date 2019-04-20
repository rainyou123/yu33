public class text1 {
     //享元模式 一字节 -128~127
     public static void main(String[] args) {
         Integer i1=10;
         Integer i2=10;
         System.out.println(i1==i2);
         Integer i3=new Integer(10);
         Integer i4=new Integer(10);
         System.out.println(i3==i4);
         int a=Integer.valueOf("234");//转成整型
         int a2=Integer.parseInt("234");
         Double d=Double.valueOf("234.0");
         System.out.println(Integer.MAX_VALUE);
     }
}
