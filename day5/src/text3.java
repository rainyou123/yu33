public class text3 {
    //throw  throws
    public static void main(String[] args) {

        try{
            System.out.println(div(10 , 0));
        }catch (ArithmeticException eeee){
            System.out.println("异常");
            eeee.printStackTrace();
       }
    }
    //throws 和throw 写一个就行都是抛出异常
    //throws 是抛出方法  throw是抛出个对象
    public static int div(int a,int b) throws ArithmeticException{
        int c = a / b;
       System.out.println(c);
       throw new ArithmeticException();
//       return 1; 这句话不能执行 所以要被注释
    }
}

