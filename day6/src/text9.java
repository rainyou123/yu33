import java.util.ArrayList;
import java.util.List;

public class text9 {
    public static void main(String[] args) {
        List c = new ArrayList();
        arrayList();
    }
    public static void arrayList(){
        List<String> list=new ArrayList<>();//多态
        //remove()方法里参数可以是对象，可以是索引
        list.add("lili");
        list.add("rose");
        list.add("lily");
        list.add("jack");
        list.add("100");
        list.add("jack");
        list.add(2 , "wudi");
        //如果上边没写<String>就不能底下那么用
//        for (String s:list) {
//             System.out.println(s);
//        }
        for(int i = 0 ; i< list.size() ; i++){
            System.out.println(list.get(i));
            // System.out.println(Integer.valueOf((String)list.get(i)));
        }
    }
}
