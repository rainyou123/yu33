import java.util.*;


public class Test_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        System.out.println("请输入单词数量");
        int n=sc.nextInt();
        System.out.println("请输入单词");
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                System.out.println(o1.compareToIgnoreCase(o2));
                return o1.compareToIgnoreCase(o2);//忽略大小写的对比
            }
        });
        list.forEach(s -> System.out.println(s));
    }
}
