public class text5 {
    public static void main(String[] args) {
        Student s1=new Student(1,21,"十一");
        Student s2=new Student(1,21,"十一");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        if (equals(s1, s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(equals(s1, s2));
    }
    public static boolean equals(Object anObject,Student s){
        if(anObject instanceof Student){
            if(s.getId()!=((Student) anObject).getId()){
                return false;
            }else if(s.getAge()!=((Student) anObject).getAge()){
                return false;
            }else if(!s.getName().equals(((Student) anObject).getName())){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
}
class Student{
    int id;
    int age;
    String name;
    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
