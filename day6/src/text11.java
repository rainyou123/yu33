import java.util.List;
import java.util.Vector;

public class text11 {
    public static void main(String[] args) {
        vector();
    }
    public static void vector(){
        List<String> list=new Vector<>();
        list.add("hh1");
        list.add("hh2");
        list.add("hh3");
        for (String s:list){
            System.out.println(s);
        }
    }
}

//v和ArrayList扩容方法不一样 v扩融1倍 A扩容1/2
//v线程安全 A不安全
//set没有索引