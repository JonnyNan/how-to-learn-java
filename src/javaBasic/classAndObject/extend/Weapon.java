package javaBasic.classAndObject.extend;

/**
 * 在LOL中，武器是物品的一种，也是有名称和价格的
 * 所以在设计类的时候，可以让武器继承物品，从而继承名称和价格属性
 */
public class Weapon {
    String name;
    int price;
    int damage; //攻击力  不继承物品 就需要加上 名字和价格
}
