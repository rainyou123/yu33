//单例模式
public class text5 {
    public static void main(String[] args) {
        //他俩指向一个对象 所以会返回true
        SingleTon s1= SingleTon.getSingleTon();
        SingleTon s2=SingleTon.getSingleTon();
        System.out.println(s1==s2);
        SingleTon1 s3=SingleTon1.getSingleTon1();
        SingleTon1 s4=SingleTon1.getSingleTon1();
        System.out.println(s3==s4);
    }
}
//饿汉式 上来就new 但也只new一次
class SingleTon{
    private SingleTon(){}
    private static SingleTon singleTon=new SingleTon();
    public static SingleTon getSingleTon(){
        return singleTon;
    }
}
//懒汉式 有人用我我才new 但只要第一个人new过了，以后多少人用都不会new
class SingleTon1{
    private  SingleTon1(){}
    private static SingleTon1 singleTon1=null;
    public static SingleTon1 getSingleTon1(){
        if(null==singleTon1){ //判断是否为空
            singleTon1=new SingleTon1();
        }
        return singleTon1;
    }
}
