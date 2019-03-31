import java.util.Scanner;

//return 以后不执行
//栈内存stack和堆内存heap(共有五种这是其中两种)
//stack：成员变量 heap：所有new出来的东西
//引用类型 数组(数组长度可以改变类似数组扩充)
// 数组的长度不可以动态改变
public class text1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] a={1,2,3,5,7,9};
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                flag=true;
            }
        }
        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

}
