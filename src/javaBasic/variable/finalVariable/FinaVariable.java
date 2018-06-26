package javaBasic.variable.finalVariable;

/**
 *  当一个变量被final修饰的时候，该变量只有一次赋值的机会
 */
public class FinaVariable {

    //在声明的时候赋值
    public void method1(){
        final int i =5;

        //i =6; 不能再次赋值，出现编译错误。

    }

    //在声明的时候不赋值
    public void method2(){
        final int i;
        i = 5;
       // i = 6;//这里才算是第二次赋值
    }

    public class HelloWorld {

        public void method1(final int j) {
            //j = 5; //j传参数的时候就完成了第一次赋值，所以这里编译报错
        }
    }


    //final 除了修饰变量，还可以修饰类，修饰方法，这些都在后续的章节展开

}
