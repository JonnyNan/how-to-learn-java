package javaBasic.controlFlow;


/**
 * if(表达式1){
 * 表达式2；
 * }
 * <p>
 * <p>
 * 如果表达式1的值是true,
 * 就执行表达式2
 */
public class If {
    public static void main(String[] args) {
        boolean b = true;
        //如果成立就打印yes
        if (b) {
            System.out.println("yes");
        }
    }

    //多表达式与一个表达式
    public void method1() {
        boolean b = false;
        //如果有多个表达式，必须用大括弧包括起来
        if (b) {
            System.out.println("yes1");
            System.out.println("yes2");
            System.out.println("yes3");
        }

        //否则表达式2 3 无论b是否为true都会执行

        if (b)
            System.out.println("yes1");
        System.out.println("yes2");
        System.out.println("yes3");

        //如果只有一个表达式可以不用写括弧，看上去会简约一些
        if (b) {
            System.out.println("yes1");
        }

        if (b)
            System.out.println("yes1");
    }

    // ; 也是一个完成的表达式
    public void method2() {
        boolean b = false;

        if (b) ;
        System.out.println("yes");//无论如何都会打印yes。if只管到；

    }

    // if and else
    public void method3() {
        boolean b = false;

        if (b)
            System.out.println("yes");
        else
            System.out.println("no");

    }

    //else if 是多条件判断
    public void method4() {

        //如果只使用 if,会执行4次判断
        int i = 2;
        if (i == 1)
            System.out.println(1);
        if (i == 2)
            System.out.println(2);
        if (i == 3)
            System.out.println(3);
        if (i == 4)
            System.out.println(4);

        //如果使用else if, 一旦在85行，判断成立， 87行和89行的判断就不会执行了，节约了运算资源
        if (i == 1)
            System.out.println(1);
        else if (i == 2)
            System.out.println(2);
        else if (i == 3)
            System.out.println(3);
        else if (i == 4)
            System.out.println(4);

    }
}
