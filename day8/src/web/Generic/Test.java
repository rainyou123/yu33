package web.Generic;

public class Test {
    public static void main(String[] args) {
        Node n=new Node("haha");
        Node<String> n1=new Node<>("yi");
        Node<Number> n2=new Node<>(23);//number 所有数值类型父类
        Node<Integer> n3=new Node<>(12);
//        n2=n3;不能直接转换；
        Number n4=12;
        Integer n5=34;
        n4=n5;//正常可以转换
        System.out.println(n4);
        n5=(Integer) n4;//强转
//        System.out.println(n2 = getData(n1));//n2=yi;
//        System.out.println(n2=getData(n3));//n2=12
//        System.out.println(n1=getData(n2));//n1=23
//        getData1(n1);  输入有误接受Integer
        System.out.println(n2 = getData1(n3)); //n2=12 可以转换
//        System.out.println(n2 = getData2(n3)); //不以转换 找到的是Integer 需要的是Number
    }
    public static Node getData(Node node){
        return node;
    }
    public static Node getData1(Node<Integer> node){
        return node;
    }
    public static Node<Integer> getData2(Node<Integer> node){
        return node;
    }
}
