import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

//BigInteger类
public class text5 {
    public static void main(String[] args) {
        String s1 = "4548421212154512";
        String s2 = "1254532145121548";
        BigInteger b1=new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        System.out.println(b1);
        System.out.println(b2);
        //输出一个新的对象值为b1+b2
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2));
        System.out.println(b1.remainder(b2));
        //b1.divideAndRemainder(b2)是一个数组
        System.out.println(Arrays.toString(b1.divideAndRemainder(b2)));
        String s3 = "1.254532145121548";
        BigDecimal bm = new BigDecimal(s3);
        System.out.println(bm);
    }
}
