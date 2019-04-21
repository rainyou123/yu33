import java.util.Arrays;

public class text6 {
    public static void main(String[] args) {
        String str="ab25zxb1,23xbs,2hd5,6fxbbds";
        System.out.println(str.charAt(2));//输出索引为2的字符
        char[] c=str.toCharArray();//将字符串变成字符型数组
        System.out.println(Arrays.toString(c));
        char[] cs={'2','1','x'};
        String s=new String(cs,0,2);//将字符数组变成字符串截取0-2 不包括2
        System.out.println(s);
        System.out.println(str.startsWith("ab"));//字符串是否以ab开头
        System.out.println(str.startsWith("b25",1));//字符串是够以搜引位置开头
        System.out.println(str.replace("b","*"));//将指定字符替换

    }
}
//    public static void main(String[] args) {
//        String str = "aghdd1,2skyhd234,3sd54jh";
//        System.out.println(str.substring(2 , 6));*/
//        //System.out.println(Arrays.toString(str.split(","  , 3)));
//
//        //System.out.println(str.replaceAll("\\d" , "*"));
//       /* System.out.println(str.contains("yhd"));
//        if(str.indexOf("yh") != -1){
//            System.out.println("包含");
//        }*/
//        String str2 = null;
//        //System.out.println(str2.isEmpty());
//        if(null != str2 && !str2.isEmpty()){
//            System.out.println(str2);
//        }
//        int[] ii = {1,2};
//        System.out.println(ii.length);
//        System.out.println(str.length());
//        String str4 = "   ds   dsd   ";
//
//        /*System.out.println(str4.toLowerCase());
//        System.out.println(str4.toUpperCase());*/
//        System.out.println(str4.trim());
//        String s = "";
//        s = s + "abs";
//        s = s + "123";
//        System.out.println(s);
//        StringBuffer sb = new StringBuffer(30);
//        sb.append("abs").append("12fsdfdsfsfdsfdsdf434343sdfsdsf3");
//        System.out.println(sb.toString());
//    }