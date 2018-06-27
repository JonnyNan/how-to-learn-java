package javaBasic.operationalCharacter.relationalOperator;

/**
 * 关系操作符:比较两个变量之间的关系
 * > 大于
 * >= 大于或等于
 * < 小于
 * <= 小于或等于
 * == 是否相等
 * != 是否不等
 */
public class Relational {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 5;

        System.out.println(a>b);  //返回 false
        System.out.println(a>=c);  //返回 true

        System.out.println(a==b); //返回false
        System.out.println(a!=b);//返回true

    }
}
