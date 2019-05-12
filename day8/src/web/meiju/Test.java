package web.meiju;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public enum ColorEnum{//枚举类 static final class
        RED(5,"red"),BLUE(1,"blue"),GREEN;//对象
        private ColorEnum(){};
        private ColorEnum(int age,String name){//枚举构造方法私有 单例的
            this.age=age;
            this.name=name;
        };
        private int age;
        private String name;
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        ColorEnum c=ColorEnum.RED;
        switch (c){
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            default:
                System.out.println("错误");

        }
        System.out.println(ColorEnum.GREEN.getName());//null
        System.out.println(ColorEnum.RED.getName());//red
        EnumMap<ColorEnum , String> map = new EnumMap<>(ColorEnum.class);
        map.put(ColorEnum.RED,"红色");
        map.put(ColorEnum.GREEN,"绿色");
        map.put(ColorEnum.BLUE,"蓝色");
//        EnumMap<ColorEnum , Integer> map1 = new EnumMap<>(ColorEnum.class);
//        map1.put(ColorEnum.RED,1);
        System.out.println("----------------------------------");
        map.forEach((s,v)-> System.out.println(s));//RED BLUE GREEN
        System.out.println("----------------------------------");
        map.forEach((s,v)-> System.out.println(v));//红色 蓝色 绿色
        Set<Map.Entry<ColorEnum, String>> entries = map.entrySet();
        entries.forEach(w-> System.out.println(w.getKey().getName()));

//        Map<Person, Integer> map2=new HashMap<>();
//        Person p1=new Person();
//        map2.put(p1,1);
//        map2.forEach((s,v)-> System.out.println(s));//输出Person对象web.meiju.Person@448139f0

    }
}
//class Person{
//    private String name;
//}