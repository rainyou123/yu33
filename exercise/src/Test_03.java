public class Test_03 {
    public static void main(String[] args) {
        bb b1=new bb();
        System.out.println(b1.haha());
        String s1="abc";
        String s2="ab"+"c";
        System.out.println(s1==s2);
    }

}
class aa{
    private String text="aa";
    public  String haha(){
        return text;
    }
}
class bb extends aa{
    private String text="bb";
    public  String haha(){
        return text;
    }
}