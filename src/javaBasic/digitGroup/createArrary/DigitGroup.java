package javaBasic.digitGroup.createArrary;
//digit group
//数组是一个固定长度的，包含了相同类型数据的 容器
public class DigitGroup {
    /**
     * int[] a; 声明了一个数组变量。
     * []表示该变量是一个数组
     * int 表示数组里的每一个元素都是一个整数
     * a 是变量名
     * 但是，仅仅是这一句声明，不会创建数组
     *
     * 有时候也会写成int a[]; 没有任何区别，就是你看哪种顺眼的问题
     */
    public void method1(){
        //声明一个数组
        int [] a;
    }

    //创建数组
    public void createArrary(){
        /**
         * 创建数组的时候，要指明数组的长度。
         * new int[5]
         * 引用概念：
         * 如果变量代表一个数组，比如a,我们把a叫做引用
         * 与基本类型不同
         * int c = 5; 这叫给c赋值为5
         * 声明一个引用 int[] a;
         * a = new int[5];
         * 让a这个引用，指向数组
         */
        //声明一个引用
        int[] a;
        //创建一个长度是5的数组，并且使用引用a指向该数组
        a = new int[5];

        int[] b = new int[5]; //声明的同时，指向一个数组
    }

    //访问数组
    public void method2(){
        /**
         * 数组下标基0
         * 下标0，代表数组里的第一个数
         */
        int[] a;
        a = new int[5];

        a[0]= 1;  //下标0，代表数组里的第一个数
        a[1]= 2;
        a[2]= 3;
        a[3]= 4;
        a[4]= 5;
    }

    //数组长度
    public void method3(){
        /**
         *
         * .length属性用于访问一个数组的长度
         * 数组访问下标范围是0到长度-1
         * 一旦超过这个范围,就会产生数组下标越界异常
         */
        int[] a;
        a = new int[5];

        System.out.println(a.length); //打印数组的长度

        a[4]=100; //下标4，实质上是“第5个”，既最后一个
        a[5]=101; //下标5，实质上是“第6个”，超出范围 ,产生数组下标越界异常
    }

}
