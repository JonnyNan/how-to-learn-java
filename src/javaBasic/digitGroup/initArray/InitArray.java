package javaBasic.digitGroup.initArray;

public class InitArray {
    //分配空间与赋值分步进行
    public static void main(String[] args) {
        int[] a = new int[5]; //分配了长度是5的数组，但是没有赋值

        //没有赋值，那么就会使用默认值
        //作为int类型的数组，默认值是0
        System.out.println(a[0]);

        //进行赋值

        a[0] = 100;
        a[1] = 101;
        a[2] = 103;
        a[3] = 120;
        a[4] = 140;
    }


    //分配空间，同时赋值
    public void method(){
        //写法一： 分配空间同时赋值
        int[] a = new int[]{100,102,444,836,3236};

        //写法二： 省略了new int[],效果一样
        int[] b = {100,102,444,836,3236};

        //写法三：同时分配空间，和指定内容
        //在这个例子里，长度是3，内容是5个，产生矛盾了
        //所以如果指定了数组的内容，就不能同时设置数组的长度
        //int[] c = new int[3]{100,102,444,836,3236};
    }
}
