package variableActionScope;

/**
 * 变量处于不同的位置，有不同的名称
 *
 * 分别是
 * 字段，属性
 * 参数
 * 局部变量
 *
 * 不同名称的变量，其作用域是不一样的
 */
public class ActionScope {

    /**
     * 当一个变量被声明在类下面
     * 变量就叫做字段 或者属性、成员变量、Field
     * 比如变量i,就是一个属性。
     * 那么从第2行这个变量声明的位置开始，整个类都可以访问得到
     * 所以其作用域就是从其声明的位置开始的整个类
     */

    int i = 1;
    int j = i;  //其他的属性可以访问i
    public void method1(){
        System.out.println(i); //方法1里可以访问i
    }
    public void method2(){
        System.out.println(i); //方法2里可以访问i
    }

    /**
     * 如果一个变量，是声明在一个方法上的，就叫做参数
     * 参数的作用域即为该方法内的所有代码
     * 其他方法不能访问该参数
     * 类里面也不能访问该参数
     */


    public void method3(int i){ //参数i的作用域即方法method3
        System.out.println(i);
    }
    public void method4(){

        System.out.println(i); //method4 不能访问参数i
    }

    //int j = i;  //类里面也不能访问参数i

    /**
     *
     * 声明在方法内的变量，叫做局部变量
     * 其作用域在声明开始的位置，到其所处于的块结束位置
     */

    public void method5() {
        int i  = 5;  //其作用范围是从声明的第57行，到其所处于的块结束65行位置
        System.out.println(i);
        {            //子块
            System.out.println(i); //可以访问i
            int j = 6;
            System.out.println(j); //可以访问j
        }
        System.out.println(j); //不能访问j,因为其作用域到第63行就结束了
    }
}
