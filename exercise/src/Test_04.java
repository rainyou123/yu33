import java.util.ArrayList;
import java.util.List;

public class Test_04 {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        int n=5;
        for (int i=1;i<=n;i++){
            list.add(new Person());
        }
        int index=1;
        int sum=n;
        int x=0;
        do{
            for(int i=0;i<sum;i++){
                if(index%3==0){
                    list.remove(i);
                    x++;
                }
                index++;
                if(index==4){index=1;}
                System.out.println(list.size());
            }
            sum=n-x;
            x=0;
        }while(list.size()!=1);
        System.out.println(list.size());
    }
}
class Person{
    public static int num=1;
    public int id;
    public Person(){
        id=num++;
    }
    public int getId(){
        return id;
    }
}