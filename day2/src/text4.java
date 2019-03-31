import java.lang.reflect.Array;
import java.util.Arrays;

public class text4 {
    public static void main(String[] args) {
        int[] a={12,36,23,20,34,65};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        //12,36,23,20,34,65
        //12,36,23,20,34,65 第一轮结束
        //12,23,36,20,34,65
        //12,20,36,23,34,65 第二轮结束
        //12,20,23,36,34,65 第三轮结束
        //12,20,23,34,36,65 第四轮结束
        //12,20,23,34,36,65 第五轮结束
    }
}
