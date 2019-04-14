import java.util.Arrays;

public class text6 {
    public static void main(String[] args) {
        ChickenManage c1=new ChickenManage(6);
        c1.addChicken(new Chicken(1,"小鸡1",1,6));
        c1.addChicken(new Chicken(2,"小鸡2",3,7));
        c1.addChicken(new Chicken(3,"小鸡3",4,2));
        c1.addChicken(new Chicken(4,"小鸡4",2,5));
        c1.addChicken(new Chicken(5,"小鸡5",1,3));
        c1.addChicken(new Chicken(6,"小鸡6",1,2));
        c1.addChicken(new Chicken(7,"小鸡7",3,4));
        c1.printInfo();
        System.out.println("---------------------------------------------");
        c1.updateChicken(new Chicken(2,"花花",1,2));
        c1.printInfo();
        System.out.println("---------------------------------------------");
        System.out.println(c1.getChickenById(1));
        System.out.println("---------------------------------------------");
        c1.deleteChickenById(5);
        c1.printInfo();

    }
}
class ChickenManage{
    private Chicken[] chickens; //鸡舍
    int count=0;
    public ChickenManage(){}
    public ChickenManage(int size){
        chickens=new Chicken[size];
    }
    public void addChicken(Chicken c){
        if(count==chickens.length){
            chickens=Arrays.copyOf(chickens,chickens.length+1);
        }
        chickens[count++]=c;
    }
    public void updateChicken(Chicken c){
        for(Chicken c1:chickens){
            if(c.getId()==c1.getId()){
                c1.setName(c.getName());
                c1.setAge(c.getAge());
                c1.setWeight(c.getWeight());
            }
        }
    }

    public Chicken getChickenById(int i){
        for(Chicken c:chickens){
            if(c.getId()==i){
                return c;
            }
        }
        return null;
    }
//    删除鸡的第一种方法
//    public void deleteChickenById(int c){
//        for(int i=0;i<chickens.length;i++){
//            if(chickens[i].getId()==c){
//                chickens[i]=null;
//            }
//        }
//    }
    public void deleteChickenById(int c){
        for(int i=0;i<chickens.length;i++){
            if(chickens[i].getId()==c){
                for(int j=i;j<chickens.length;j++){
                    if(j+1==chickens.length){
                        break;
                    }
                    chickens[j]=chickens[j+1];
                }
            }
        }
        chickens[chickens.length-1]=null;
    }
    public void printInfo(){
        for(Chicken c:chickens){
            //必须判断，否则若是添加的鸡 没有鸡舍的鸡多就会输出null
            if(null!=c){
                System.out.println(c);
            }

        }
    }
}
class Chicken{
    private int id;
    private String name;
    private int age;
    private int weight;
    public Chicken(){}
    public Chicken(int id,String name,int age,int weight){
        this.id=id;
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
