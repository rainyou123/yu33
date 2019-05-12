import java.util.ArrayList;
import java.util.List;
/**
 * 3.有如下Student 对象 ， 包含(name ,  age ， score ， className) 属性。
 通过集合创建5个以上学生对象。计算学生得平均年龄和每个班级的平均分
 (创建两个以上班级一样的学生)。
 */
public class test3 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("李四",12,88.5f,"一班"));
        list.add(new Student("张三",14,79.0f,"一班"));
        list.add(new Student("王五",11,99.5f,"二班"));
        list.add(new Student("赵六",12,45.5f,"二班"));
        list.add(new Student("钱一",13,80.0f,"三班"));
        list.add(new Student("周七",11,93.5f,"三班"));
        list.add(new Student("吴八",15,95.5f,"三班"));

        System.out.println("所有学生平均年龄"+aveage(list));
        System.out.println("一班成绩"+getClassScore(list,"一班"));
        System.out.println("二班成绩"+getClassScore(list,"二班"));
        System.out.println("三班成绩"+getClassScore(list,"三班"));


    }
    public static float aveage(List<Student> list){
        float sum=0.0f;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i).getAge();
        }
        return sum/list.size();
    }
    public static float getClassScore(List<Student> list,String s){
        float sum1=0.0f,a1=0;
        float sum2=0.0f,a2=0;
        float sum3=0.0f,a3=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getClassName().equals("一班")){
                sum1+=list.get(i).getScore();
                a1++;
            }else if(list.get(i).getClassName().equals("二班")){
                sum2+=list.get(i).getScore();
                a2++;
            }else{
                sum3+=list.get(i).getScore();
                a3++;
            }

        }
        if(s.equals("一班")){
            return sum1/a1;
        }else if(s.equals("二班")) {
            return sum2/a2;
        }else{
            return sum3/a3;
        }
    }
}
class Student{
    private String name;
    private int age;
    private float score;
    private String className;
    public Student(){};

    public Student(String name, int age, float score, String className) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.className = className;
    }

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

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}