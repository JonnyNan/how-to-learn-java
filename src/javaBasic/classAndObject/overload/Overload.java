package javaBasic.classAndObject.overload;

import javaBasic.classAndObject.Hero;

//方法的重载指的是方法名一样，但是参数类型不一样
public class Overload extends Hero {

    public void attack() {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }

    public void attack(Hero h1) {
        System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
    }

    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
    }

    public void attack2() {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }

    // 可变数量的参数
    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " 攻击了 " + heros[i].name);

        }
    }

    public static void main(String[] args) {
//        ADHero bh = new ADHero();
//        bh.name = "赏金猎人";
//
//        Hero h1 = new Hero();
//        h1.name = "盖伦";
//        Hero h2 = new Hero();
//        h2.name = "提莫";
//
//        bh.attack(h1);
//        bh.attack(h1, h2);
    }
}
