import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {
    //  重写方法 若返回正数前面大于后面的；返回负数前面小于后面的
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getAge() - o2.getAge();
    }
}