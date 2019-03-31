public class text4 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        for(int n=0;n<5;n++){
            System.out.print(i+" "+j+" "); //' '单引是字符不能当字符串用
            i=i+j;
            j=i+j;
        }
    }
}
