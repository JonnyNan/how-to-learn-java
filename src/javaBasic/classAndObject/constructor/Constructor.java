package javaBasic.classAndObject.constructor;

public class Constructor {
    //通过一个类创建一个对象，这个过程叫做实例化
    //
    //实例化是通过调用构造方法(又叫做构造器)实现的

    /**
     * 方法名和类名一样（包括大小写）
     * 没有返回类型
     * 实例化一个对象的时候，必然调用构造方法
     */
    String name;

//    public Constructor(){
//        System.out.println("实例化一个对象的时候，必然调用构造方法");
//    }


    //有参的构造方法
    //默认的无参的构造方法就失效了
    public Constructor(String heroname) {
        name = heroname;
    }

    public static void main(String[] args) {
        //实例化一个对象的时候，必然调用构造方法
        Constructor c = new Constructor("hehe");

        //Constructor c1 = new Constructor()；//无参的构造方法“木有了”


    }

    //构造方法可以重载
    //带一个参数的构造方法
//    public Hero(String heroname){
//        name = heroname;
//    }
//
//    带两个参数的构造方法
//    public Hero(String heroname,float herohp){
//        name = heroname;
//        hp = herohp;
//    }


    //这个无参的构造方法，如果不写，
    //就会默认提供一个无参的构造方法
    //  public Hero(){
    //      System.out.println("调用Hero的构造方法");
    //  }


}
