import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Text_06 {

    public static void main(String[] args) {
        int a=(2<<3)+1;
        int b=2<<3 + 1;
        System.out.println(a + " " + b);
        Random r=new Random();
        int count=0;
        List<Integer> list= new ArrayList<> ();
        while(count<10){
            int number=r.nextInt(20)+1;
            if(!list.contains(number)){
                list.add(number);
                count++;
            }
        }
        list.forEach(i-> System.out.println(i));
    }
}
