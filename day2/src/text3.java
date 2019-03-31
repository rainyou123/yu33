public class text3 {
    public static void main(String[] args) {
        int[][] a={{11,22},{44,55,66},{77,88,99}};
        //静态输入数的长度随意
        for(int i=0;i<a.length;i++){
            float sum=0.0F;
            float ave=0.0F;
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
                ave=sum/a[i].length;
            }
            System.out.println("第"+(i+1)+"个班的平均成绩"+ave);
        }
    }
}
