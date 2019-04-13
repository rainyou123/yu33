import java.util.Arrays;
/**
 * 选择排序
 * 14,23,21,5,7  int i=0 minIndex=0;
 * 5,23,21,14,7            minIndex=4;
 */
public class text1 {
    public static void main(String[] args) {
        int[] a={14,23,21,5,7};
        for(int i=0;i<a.length;i++){
            int minIndex=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minIndex]>a[j]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int tem=a[i];
                a[i]=a[minIndex];
                a[minIndex]=tem;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
