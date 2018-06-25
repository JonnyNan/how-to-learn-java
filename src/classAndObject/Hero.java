package classAndObject;

import java.sql.Time;
//例子，类和对象，英雄是一个类，他有很多属性。比如 名字 血量 移动速度。
//通过 new 关键字，可以由类 创建一个实际存在的对象。比如 garen 和 teemo。
public class Hero {
    String name;

    float hp;

    float armor;

    int moveSpeed;

    void keng(){
        System.out.println("keng duiyou");
    }

    float getArmor(){
        return armor;
    }

    void addSpeed(int speed){
        moveSpeed += speed;
    }

    void legendary(){
        System.out.println("chaoshen!");
    }

    float getHp() {
        return hp;
    }

    void recovery(float blood){
        hp = hp + blood;
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "garen";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;

        Hero teemo = new Hero();
        teemo.name = "teemo";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;

        System.out.println(garen.name + " 当前的血量是 " +garen.hp);
        System.out.println("回血100");
        garen.recovery(100);
        System.out.println("现在的血量是:" + garen.hp);

    }
}
