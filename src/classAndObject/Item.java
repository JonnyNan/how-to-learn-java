package classAndObject;
//练习

/**
 *
 * 设计出物品这种类
 * 类名：Item
 * 物品有如下属性:
 * 名字 name 类型是字符串String
 * 价格 price 类型是整型 int
 *
 * 创建(实例化)3件具体物品
 * 名称 价格
 * 血瓶 50
 * 草鞋 300
 * 长剑 350
 */
public class Item {
    String name;
    int price;

    public static void main(String[] args) {
        Item xuepin = new Item();
        xuepin.name = "xuepin";
        xuepin.price=50;

        Item caoxie = new Item();
        caoxie.name = "caoxie";
        caoxie.price=300;

        Item changjian = new Item();
        changjian.name="changjian";
        changjian.price= 350;
    }
}
