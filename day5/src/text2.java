import java.util.Arrays;

public class text2 {
    public static void main(String[] args) {
        System.out.println(h(10,0));
    }
    public static int h(int a,int b){
        int[] arr={1,2,3};
        try {
            arr=null;
            //找到异常后try后的语句不执行了
            System.out.println(arr.length);
            int c = a / b;
            System.out.println(c);
            return 2;
        }catch (ArithmeticException e) {
            System.out.println("除零异常");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
        //finally是多线程 所以怎样都执行 而且与catch执行速度不一定谁快。
        //finally比return执行速度快 与他俩先后顺序无关。
        finally {
            System.out.println("无论怎样我都执行！");
        }
//        System.out.println(arr.length);
        //拿出来还是不能执行
        return -1;
    }
}
