import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class text7 {
    public static void main(String[] args) {
        Locale L1=new Locale("zh","CN");
        Locale L2=new Locale("en","US");
        //获取系统默认语言
        Locale L3 = Locale.getDefault();
        //可省略后缀info后的  相对路径
        //ResourceBundle 对资源进行读取
        ResourceBundle rb = ResourceBundle.getBundle("com/demo1/info" ,L2);
        String str=rb.getString("system.name");
        System.out.println(str);
        System.out.println(rb.getString("login.username"));
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        System.out.println(rb.getString("login.pwd"));
        String pwd=sc.next();
        if("admin".equals(username)&&"1234".equals(pwd)){
            System.out.println(rb.getString("login.success"));
            String welcome=rb.getString("welcome");
            //进行动态文本处理
            //format()参数可变
            welcome= MessageFormat.format(welcome,username);
            System.out.println(welcome);
        }else{
            System.out.println(rb.getString("login.error"));
        }

    }
}
