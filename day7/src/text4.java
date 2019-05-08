import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class text4 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"tom");
        map.put(3,"lik");
        map.put(2,"twa");
        map.put(1,"tom");
        map.put(null,null);
        map.put(null,null);
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        entries.forEach(s-> System.out.println(s));
//        map.entrySet().forEach(s-> System.out.println(s));
//        1=tom  2=twa 3=lik

    }
}
