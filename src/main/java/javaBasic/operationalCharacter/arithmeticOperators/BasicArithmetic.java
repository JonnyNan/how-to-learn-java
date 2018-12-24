package javaBasic.operationalCharacter.arithmeticOperators;


/**
 * 算数操作符
 * 基本的有：
 *
 * + - * / %
 *
 *
 * 自增 自减
 *
 * ++ --
 */
public class BasicArithmetic {

    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        int a = i + j;
        int b = i - j;
        int c = i * j;
        int d = i / j;
    }

    //任意运算单元的长度超过int
    public void method1(){

    int a = 5;
    long b = 6;
    int c = (int) (a+b); //a+b的运算结果是long型，所以要进行强制转换
    long d = a+b;
    }

    //任意运算单元的长度小于int
    public void method2() {
            byte a = 1;
            byte b= 2;
            byte c = (byte) (a+b); //虽然a b都是byte类型，但是运算结果是int类型，需要进行强制转换
            int d = a+b;

    }
    //取模 %  求余数
    public void method3(){
        int i = 5;
        int j = 2;
        System.out.println(i%j); //输出为1
    }

    //自增 自减
    public void method4(){
        int i = 5;
        i++;
        System.out.println(i);//输出为6
    }

    /**
     * 以++为例
     * int i = 5;
     * i++; 先取值，再运算
     * ++i; 先运算，再取值
     */

    public void method5(){
        int i = 5;
        System.out.println(i++); //输出5
        System.out.println(i);   //输出6

        int j = 5;
        System.out.println(++j); //输出6
        System.out.println(j);   //输出6
    }
}
