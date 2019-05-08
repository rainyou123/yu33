import java.util.*;

public class text5 {
    public static void main(String[] args) {
//        Set<Student> sets=new HashSet<>();
//        sets.add(new Student("寒寒",12,"牡丹江"));
//        sets.add(new Student("花花",11,"黑河"));
//        sets.add(new Student("憨憨",12,"牡丹江"));
//        sets.add(new Student("寒寒",12,"哈尔滨"));
//        sets.forEach(s-> System.out.println(s));
//        sets.forEach(s-> System.out.println(s.hashCode()));
        Map<Student,String> maps=new HashMap<>();
        maps.put(new Student("寒寒",12),"牡丹江");
        maps.put(new Student("花花",11),"黑河");
        maps.put(new Student("憨憨",12),"牡丹江");
        maps.put(new Student("寒寒",12),"哈尔滨");
        Set<Map.Entry<Student, String>> entries = maps.entrySet();
        for(Map.Entry e: entries){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println("--------------------------------------");
        entries.forEach(s->System.out.println(s));
        System.out.println("--------------------------------------");
        Iterator<Map.Entry<Student, String>> iterator = entries.iterator();
//        Iterator iterator=entries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
class Student{
    private String name;
    private int age;
//    private String address;
    public Student(){}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //    public Student(String name, int age, String address) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
//    public String getAddress() {
//        return address;
//    }
//    public void setAddress(String address) {
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", address='" + address + '\'' +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
