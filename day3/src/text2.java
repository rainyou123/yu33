import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class text2 {
    public static void main(String[] args) {
        String[] pool=getPool();
        Arrays.sort(pool);
//        System.out.println(Arrays.toString(pool));
        String[] redballs=getRedBalls(pool);
        Arrays.sort(redballs);
        Random r=new Random();
        String blueBall=pool[r.nextInt(16)];
        System.out.println("请选择购买方式：1.机选 2.人选");
        Scanner sc=new Scanner(System.in);
        int method=sc.nextInt();
        String[] userRedBalls=new String[6];
        String userBlueBall="";
        switch (method){
            case 1:
                userRedBalls=getRedBalls(pool);
                userBlueBall=pool[r.nextInt(16)];
                break;
            case 2:
                System.out.println("请输入6个数 01-33");
                for(int i=0;i<userRedBalls.length;i++){
                    userRedBalls[i] = sc.next();
//                    boolean flag=false;
//                    String redball=sc.next();
//                    for(int j=0;j<userRedBalls.length;j++){
//                        if(redball.equals(userRedBalls[j])){
//                            flag=true;
//                        }
//                    }
//                    if(!flag){
//                        userRedBalls[i]=redball;
//                    }
                }

                System.out.println("请输入蓝球 01-16");
                userBlueBall=sc.next();
                break;
            default:
                System.out.println("");
                break;
        }
        Arrays.sort(userRedBalls);
        System.out.println("系统红球"+Arrays.toString(redballs));
        System.out.println("系统蓝球"+blueBall);
        System.out.println("用户红球"+Arrays.toString(userRedBalls));
        System.out.println("用户蓝球"+userBlueBall);
        int count=0;
        for(int i=0;i<redballs.length;i++){
            for(int j=0;j<userRedBalls.length;j++){
                if (redballs[i].equals(userRedBalls[j])){
                    count++;
                }
            }
        }
        if(blueBall.equals(userBlueBall)){
            System.out.println("六等奖");
        }else if(count==4){
            System.out.println("五等奖");
        }else{
            System.out.println("没有中奖！");
        }
    }
    //获取奖池   static 因为主函数main是static 主函数想要调用这个方法，这个方法只能是static
    public static String[] getPool(){
        String[] pool=new String[33];
        for(int i=0;i<pool.length;i++){
            if(i<9){
                pool[i]="0"+(i+1);
            }else{
                pool[i]=(i+1)+"";
            }
        }
        return pool;
    }
    //选红球
    public static String[] getRedBalls(String[] pool){
        String[] redBalls=new String[6];
        //去重
        boolean[] isUsed=new boolean[pool.length];
        int count=0;
        Random r=new Random();//建了一个random对象
        while(true){
            int index=r.nextInt(pool.length);//random对象的一个方法 取小于参数的整数
            if(isUsed[index])
                continue;
            isUsed[index]=true;
            redBalls[count++]=pool[index];
            if(count==redBalls.length)
                break;
        }
        return redBalls;
    }
}
