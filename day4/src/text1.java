import java.util.Arrays;

public class text1 {
    public static void main(String[] args) {
//        CosmeticManager cm = new CosmeticManager();
//        新建子类会加载初始化所有父类，相当于new了父类
        SortCosmeticManager scm = new SortCosmeticManager();
        scm.addCosmetic(new Cosmetic("雅诗拉带", "进口", 23));
        scm.addCosmetic(new Cosmetic("曼秀雷敦", "进口", 33));
        scm.addCosmetic(new Cosmetic("大宝", "国产", 2));
        scm.addCosmetic(new Cosmetic("曼秀雷敦", "进口", 11));
        scm.addCosmetic(new Cosmetic("曼秀雷敦", "进口", 66));
        scm.printInfo();
        System.out.println("-------------------------------------------------------");
        TypeCosmeticManager tcm = new TypeCosmeticManager();
        tcm.addCosmetic(new Cosmetic("雅诗拉带", "进口", 23));
        tcm.addCosmetic(new Cosmetic("曼秀雷敦", "进口", 33));
        tcm.addCosmetic(new Cosmetic("大宝", "国产", 2));
        tcm.addCosmetic(new Cosmetic("曼秀雷敦", "进口", 11));
        tcm.addCosmetic(new Cosmetic("曼秀雷敦", "进口", 66));
        tcm.printInfo();
    }
}
class Cosmetic{
    private String name;
    private String type;
    private int price;
    //shift 点下边全选
    public Cosmetic(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cosmetic{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
class CosmeticManager{
    Cosmetic[] cosmetics=new Cosmetic[5];
//    若是加上static 子类也能用但就是共享 而不是让子类继承
    public  int count=0;
    //进货功能
    public void addCosmetic(Cosmetic c){
        if(count==cosmetics.length){
            cosmetics= Arrays.copyOf(cosmetics,cosmetics.length+1);
        }
        cosmetics[count++]=c;
    }
    public void printInfo(){
        for(Cosmetic c:cosmetics){
            if(null!=c){
                System.out.println(c);
            }
        }
    }
}
class SortCosmeticManager extends CosmeticManager{
    @Override
    public void printInfo() {
        Cosmetic[] css=Arrays.copyOf(cosmetics,cosmetics.length);
        for(int i=0;i<count;i++){
            int minIndex=i;
            for (int j=i+1;j<count;j++){
                if(css[minIndex].getPrice()>css[j].getPrice()){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                Cosmetic c=css[minIndex];
                css[minIndex]=css[i];
                css[i]=c;
            }
        }
        for(Cosmetic c:css){
            System.out.println(c);
        }
    }
}
class  TypeCosmeticManager extends CosmeticManager {
    public void printInfo(){
        for(int i=0;i<count;i++){
            if(cosmetics[i].getType().equals("进口")){
                System.out.println(cosmetics[i]);
            }
        }
    }
}


