import java.util.Scanner;

public class fiveBit {
    public static void main(String[] args){
        System.out.println("请输入一个五位数");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int w=a/10000;
        int q=a/1000%10;
        int b=a/100%10;
        int s=a/10%10;
        int g=a%10;
        System.out.println("总和"+(w+q+b+s+g));
    }
}
