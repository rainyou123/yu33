public class text3 {
    //快捷键 alt+insert得到getter，setter
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("孙悟空");
        Weapon weapon=new Weapon();
        weapon.setName("如意金箍棒");
        hero.setWeapon(weapon);
        weapon.setHero(hero);
        System.out.println(hero.getName()+hero.getWeapon().getName());
        System.out.println(weapon.getName()+weapon.getHero().getName());

    }
}
class Hero{
    private String name;
    private Weapon weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
class Weapon{
    private  String name;
    private Hero hero;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
