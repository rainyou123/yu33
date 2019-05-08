import java.util.*;
import java.util.function.Supplier;

public class text2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("saa");
        list.add("enz");
        list.add("momo");
        list.add("nana");
        iterator(list);
//        String[] strings = textSupplier(10,()->{
//            String[] ss=new String[10];
//            for (int i=0;i<ss.length;i++){
//                ss[i]=(Math.random()*100)+"";
//            }
//            return ss;
//        });
        String[] strings=textSupplier(10,()->{
           String [] strings1=new String[10];
           for(int i=0;i<strings1.length;i++){
               strings1[i]=(Math.random()*100)+"";
           }
           return strings1;
        });
        for(String s : strings){
            System.out.println(s);
        }
    }
    public static String[] textSupplier(int num, Supplier<String[]> s){
        return s.get();//get()是Supplier的抽象方法  Supplier函数式接口
    }
    public static void iterator(Collection<String> c) {
        Iterator<String> iterator=c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

