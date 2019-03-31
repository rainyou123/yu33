/**
 * 找最大值
*/
public class text2 {
    public static void main(String[] args) {
        int[] a={1,3,45,7,2,8};
        int max=Integer.MIN_VALUE;//系统默认最小值；
        for(int x : a){
            if(x>max){
                max=x;
            }
        }
        System.out.println(max);
    }
}
