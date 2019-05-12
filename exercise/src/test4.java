import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * 4.（Map）设计Account 对象 ， 包含(id,  balance， password)属性。 通过集合创建3个以上
 * Account 对象id自动分配。
 要求把List 中的内容放到一个Map 中，该Map 的键为id，值为相应的Account 对象。
 最后遍历这个Map，打印所有Account 对象的id 和余额。。
 */
public class test4 {

    public static void main(String[] args) {
        Account a1=new Account(1234.78,"woshi");
        Account a2=new Account(123.5,"hahah");
        Account a3=new Account(4346.54,"yihui");
        Map<Integer,Account> map= new HashMap<>();
        map.put(a1.getId(),a1);
        map.put(a2.getId(),a2);
        map.put(a3.getId(),a3);
        Set<Map.Entry<Integer, Account>> entries = map.entrySet();
//        for(Map.Entry e:entries){  //实体（取得是键值对） 取到key和value不能继续取下去
//            System.out.println(e.getKey()+"  "+e.getValue());
//        }
        entries.forEach(s-> System.out.println("ID："+s.getKey()+" 余额："+s.getValue().getBalance()));
    }
}
class Account{
    private int id;
    private double balance;
    private String password;
    Random r=new Random();
    protected Account(){}
    public Account( double balance, String password) {
        id=r.nextInt(1000);
        this.balance = balance;
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}