import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int sum=0;
//        do{
//            int num=1;
//            int j=1;
//            do{
//                num*=j;
//                j++;
//            }while(j<=i);
//            sum+=num;
//            i++;
//        }while(i<=n);
//        System.out.println(sum);
        for(i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=i;j++){
                num*=j;
            }
            sum=sum+num;
        }
        System.out.println(sum);
    }
}
