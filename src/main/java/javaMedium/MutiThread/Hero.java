package javaMedium.MutiThread;

/**
 * @author JonnyNan
 * @date 2018/10/24 - 11:47
 */
public class Hero {

    public String name;
    public float hp;

    public int damage;

    public void attackHero(Hero h){
        try {
            //为了表示攻击需要时间，每次攻击暂停1000毫秒
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);



        if (h.isDead()){
            System.out.println("别打了！"+h.name +"已经死了！");
        }
    }

    public boolean isDead(){
        return 0 >= hp;
    }
}
