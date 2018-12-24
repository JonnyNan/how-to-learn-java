package javaBasic.classAndObject.extend;

import javaBasic.classAndObject.Item;

/**
 * 在LOL中，武器是物品的一种，也是有名称和价格的
 * 所以在设计类的时候，可以让武器继承物品，从而继承名称和价格属性
 */
public class OrtherWeapon extends Item {

    int damage; //攻击力  不继承物品 就需要加上 名字和价格

    public static void main(String[] args) {
        OrtherWeapon infinityEdge = new OrtherWeapon();
        infinityEdge.damage = 65;

        infinityEdge.name="无尽之刃";
        infinityEdge.price=3600;

    }

}
