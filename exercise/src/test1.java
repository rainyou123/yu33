import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet<String> ts=new TreeSet<>();
        List<String> list=new ArrayList<>();
        System.out.println("请输入n");
        int n=sc.nextInt();
        System.out.println("请输入字符串");
        for(int i=0;i<n;i++){
//            list.add(sc.next());
            ts.add(sc.next());
        }
        ts.forEach(a-> System.out.println(a));
    }
}
