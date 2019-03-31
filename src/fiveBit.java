import java.util.Scanner;

public class fiveBit {
    public static void main(String[] args){
//        System.out.println("请输入一个五位数");
////        Scanner sc=new Scanner(System.in);
////        int a=sc.nextInt();
////        int w=a/10000;
////        int q=a/1000%10;
////        int b=a/100%10;
////        int s=a/10%10;
////        int g=a%10;
////        System.out.println("总和为"+(w+q+b+s+g));
        System.out.println("输入");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int z=x/7;
        int d=x%7;
        System.out.println("周"+z+"天数"+d);
    }
}
