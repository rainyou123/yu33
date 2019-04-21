import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class text4 {
    public static void main(String[] args) {
        System.err.println("这是一个错误！");
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 1, 3);
        System.out.println(Arrays.toString(b));
//        System.exit(0); ？？
        System.out.println(System.currentTimeMillis());
        //和无参的效果是一样的
        Date d = new Date(System.currentTimeMillis());
        Date d2 = new Date();
        System.out.println(d.toString());
        System.out.println(d2.toString());
        //得到系统属性 user.dir是当前目录 E：\Java1
        System.out.println(System.getProperty("user.dir"));
        /**
         * java.version	Java 运行时环境版本
         * java.home	Java 安装目录
         * os.name	操作系统的名称
         * os.version	操作系统的版本
         * user.name	用户的账户名称
         * user.home	用户的主目录
         * user.dir	用户的当前工作目录
         */
        //获取java运行时相关的运行时对象
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量：" + rt.availableProcessors() + " 个");
        System.out.println("Jvm总内存数 ：" + rt.totalMemory() + " byte");
        System.out.println("Jvm空闲内存数： " + rt.freeMemory() + " byte");
        System.out.println("Jvm可用最大内存数： " + rt.maxMemory() + " byte");
        //运行个记事本 exec需要捕获异常
        try {
            rt.exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}