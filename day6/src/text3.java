//克隆clone（）
public class text3 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=s1;
        s2.setName("文子");
        System.out.println(s1.getName());
        try {
            Student s3=(Student) s1.clone();
            s3.setName("麦兜");
            System.out.println(s1.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
//Cloneable仅仅是一个标识，没有任何抽象方法。实现了它的类才允许被clone
class Student implements Cloneable{
    private int age;
    private String name;
    public Student(){};

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

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
//重写object类的clone()方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
