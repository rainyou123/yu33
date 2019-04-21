import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class text10 {
    public static void main(String[] args) {
        PigManage pm=new PigManage();
        pm.add(new Pig(1,"huahua",120));
        pm.add(new Pig(2,"dahei",100));
        pm.add(new Pig(3,"xiaohuang",20));
        pm.Info();
        System.out.println("------------------------------");
        pm.remove(1);
        pm.Info();
        System.out.println("------------------------------");
        pm.upDate(new Pig(3,"dahuang",120));
        pm.Info();
        System.out.println("------------------------------");
        System.out.println(pm.getPig(3));
    }
}
class PigManage{
    List<Pig> pigs=new ArrayList<>();
    //增加
    public void add(Pig p){
        pigs.add(p);
    }
    //删除
    public void remove(int id){
        for(int i=0;i<pigs.size();i++){
            if(pigs.get(i).getId()==id){
                //两个都行
                pigs.remove(pigs.get(i));
//                pigs.remove(i);
            }
        }
    }
    //更新
    public void upDate(Pig p){
        for (int i=0;i<pigs.size();i++){
            if(pigs.get(i).getId()==p.getId()){
                pigs.set(i,p);
            }
        }
    }
    //查找
    public Pig getPig(int id){
        for(Pig p:pigs){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }
    public void Info(){
        for(int i=0;i<pigs.size();i++){
            System.out.println(pigs.get(i));
        }
    }
}
class Pig{
    private int id;
    private String name;
    private int weight;
    public Pig(){}

    public Pig(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}