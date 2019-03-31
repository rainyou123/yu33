import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
//        System.out.println("HelloWorld");
//        Scanner sc=new Scanner(System.in);
//        int b=sc.nextInt();
//        System.out.println("您输入的是"+b+"\nhello");
//        int a=23;
//        System.out.println(a==b);
        System.out.println("请输入五位数");
        Scanner sc=new Scanner(System.in);//固定语句 sc是变量名字
//        System.out.println("输入高");
//        int h=sc.nextInt();
//        System.out.println("输入半径");
//        int r=sc.nextInt();
//        System.out.println("体积"+3.14*r*r*h);
        int a=sc.nextInt();
        int w=a/10000;
        int q=a/1000%10;
        int b=a/100%10;
        int s=a/10%10;
        int g=a%10;
        System.out.println("和"+(w+q+b+s+g));

    }

}
