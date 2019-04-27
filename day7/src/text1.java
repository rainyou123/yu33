import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class text1 {
    public static void main(String[] args) {
        Set<Cat> set=new HashSet<>();
        Cat cat1=new Cat(1,"first");
        Cat cat2=new Cat(3,"third");
        Cat cat3=new Cat(2,"second");
        Cat cat4=new Cat(1,"first");
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);
        Cat[] cats = set.toArray(new Cat[]{});
        for (Cat c:cats) {
            System.out.println(c);
            System.out.println(c.hashCode());
        }

    }
}
class Cat{
    private int age;
    private String name;
    public Cat(int age, String name) {
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
    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
