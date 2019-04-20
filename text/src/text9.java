//模板方法模式
public class text9 {
    public static void main(String[] args) {
        BaseMange b=new UserMange();
        b.action("admin","add");
        b.action("haha","get");
    }
}
abstract class BaseMange {
    public abstract void execute(String b);
    public void action(String a,String b){
        if(a.equals("admin")){
            execute(b);
        }else{
            System.out.println("没有权限");
        }
    }
}
class UserMange extends BaseMange {
    @Override
    public void execute(String b) {
        if(b.equals("add")){
            System.out.println("用户添加操作");
        }else if (b.equals("get")){
            System.out.println("用户查询操作");
        }
    }
}