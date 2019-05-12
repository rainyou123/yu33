import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
// 科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，
//尼日利亚、日本，美国，中国，新西 兰，巴西，比利时，韩国，
//喀麦隆，洪都拉斯，意大利
public class test2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("科特迪瓦 ");
        list.add("阿根廷 ");
        list.add("澳大利亚 ");
        list.add("塞尔维亚 ");
        list.add("荷兰 ");
        list.add("尼日利亚 ");
        list.add("日本 ");
        list.add("美国 ");
        list.add("中国 ");
        list.add("新西兰 ");
        list.add("巴西 ");
        list.add("比利时 ");
        list.add("韩国 ");
        list.add("喀麦隆 ");
        list.add("洪都拉斯 ");
        list.add("意大利 ");
        Collections.shuffle(list);
        for(int i=0;i<list.size();i++){
            if((i)%4==0){
                if(i!=0){
                    System.out.println();
                }
                System.out.println("第"+(i/4+1)+"组");
            }
            System.out.print(list.get(i)+" ");
        }
    }
}
