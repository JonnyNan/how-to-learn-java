package javaBasic.operationalCharacter.ternaryOperators;


//三元操作符

public class TernaryOperators {
    /**
     *
     * 表达式?值1:值2
     * 如果表达式为真 返回值1
     * 如果表达式为假 返回值2
     */

    public static void main(String[] args) {

        int i = 5;
        int j = 6;

        int k = i < j ? 99 : 88;

        // 相当于
        if (i < j) {
            k = 99;
        } else {
            k = 88;
        }

        //if else 以后会看到
        System.out.println(k);

    }
}
