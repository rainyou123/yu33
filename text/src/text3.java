import java.util.Arrays;

public class text3 {
    public static void main(String[] args) {
        int[] a={23,34,12,45,13,17,11};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int tem;
                    tem=a[i];
                    a[i]=a[j];
                    a[j]=tem;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
//23 34 12 45 13 17 11
//12 34 23 45 13 17 11
//