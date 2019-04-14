public class text4 {
    public static void main(String[] args) {
        SingleTon s1=SingleTon.getSingleTon();
        SingleTon s2=SingleTon.getSingleTon();
        System.out.println(s1==s2);
        SingleTon1 s3=SingleTon1.getSingleTon1();
        SingleTon1 s4=SingleTon1.getSingleTon1();
        System.out.println(s3==s4);
    }
}
class SingleTon{
    private SingleTon (){}
    private static SingleTon singleTon=new SingleTon();
    public static SingleTon getSingleTon(){
        return singleTon;
    }
}
class SingleTon1{
    private SingleTon1(){}
    private static SingleTon1 singleTon1;
    public static SingleTon1 getSingleTon1() {
        if(singleTon1==null){
            singleTon1=new SingleTon1();
        }
        return singleTon1;
    }
}
