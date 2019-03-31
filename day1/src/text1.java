import java.io.IOException;
import java.util.Scanner;

public class text1 {
    //&  &&
    //&逻辑与（不管前面真假 后边都执行）   &&短路与（前面为假 后面表达式不再执行）
    //|  ||
    //二进制数左移几位就是乘以2的几次幂 右移几位就是除以2的几次幂
    //x?y:z
    public static void main(String[] args) {
//        int a=10;
//        System.out.println(a>5?++a:--a);
//        if(a>5){
//            System.out.println("大于5");
//        }else if(a>3){
//            System.out.println("小于等于5大于3");
//        }else{
//            System.out.println("小于等于3");
//        }
//
        int www;
//        try {
//            char c=(char)System.in.read();
//            if(c>'a' &&c< 'z'){
//                System.out.println("小写字母");
//            }else{
//                System.out.println("大写字母");
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }

//        int y=2000;
//        if((y%4==0 && y%100==0) || y%400==0){
//            System.out.println("是润年");
//        }else{
//            System.out.println("是平年");
//        }
        Scanner sc = new Scanner(System.in); //没有直接取字符的  但有取字符串的
//        int i=sc.nextInt();
//        switch (i){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println("31天");
//                break;
//            case 2:
//                System.out.println("28天");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("30天");
//                break;
//            default:
//                System.out.println("输入有误");
//    }

        int sum=0;
        int i=1;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
