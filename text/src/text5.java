import java.util.Arrays;

public class text5{
    public static void main(String[] args) {
        CosmeticManager cm=new CosmeticManager();
        cm.addCosmetic(new Cosmetic("珂润","进口",120));
        cm.addCosmetic(new Cosmetic("珂润","进口",100));
        cm.addCosmetic(new Cosmetic("大宝","国产",15));
        cm.addCosmetic(new Cosmetic("菲诗小铺","进口",35));
        cm.addCosmetic(new Cosmetic("悦诗风吟","进口",40));
        cm.addCosmetic(new Cosmetic("水密码","国产",110));
        cm.Info();
        System.out.println("--------------------------------------------------------------------------");
        SortCosmeticManager scm=new SortCosmeticManager();
        scm.addCosmetic(new Cosmetic("珂润","进口",120));
        scm.addCosmetic(new Cosmetic("珂润","进口",100));
        scm.addCosmetic(new Cosmetic("大宝","国产",15));
        scm.addCosmetic(new Cosmetic("菲诗小铺","进口",35));
        scm.addCosmetic(new Cosmetic("悦诗风吟","进口",40));
        scm.addCosmetic(new Cosmetic("水密码","国产",110));
        scm.Info();

    }
}
class CosmeticManager {
    protected Cosmetic[] cosmetics=new Cosmetic[5];
    //进货
    protected int count=0;
    public void addCosmetic(Cosmetic c){
        if(count==cosmetics.length){
            cosmetics= Arrays.copyOf(cosmetics,cosmetics.length+1);
        }
        cosmetics[count++]=c;
    }
    public void Info(){
        for(Cosmetic c:cosmetics){
            if(null!=c){
                System.out.println(c);
            }
        }
    }
}
class SortCosmeticManager extends CosmeticManager {
    public void Info(){
        Cosmetic[] css=Arrays.copyOf(cosmetics,cosmetics.length);
        //选择排序
        for(int i=0;i<count;i++){
            int minIndex=i;
            for(int j=i+1;j<count;j++){
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
            if(null!=c){
                System.out.println(c);
            }
        }
    }
}
class Cosmetic{
    private String name;
    private String type;
    private int price;
    public Cosmetic(){}
    public Cosmetic(String name,String type,int price){
        this.name=name;
        this.type=type;
        this.price=price;
    }
    public String getName(){
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

    @Override
    public String toString() {
        return "Cosmetic{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

