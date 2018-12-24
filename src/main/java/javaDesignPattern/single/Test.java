package javaDesignPattern.single;

/**
 * @description: 单例模式
 * @author: JonnyNan
 * @create: 2018-12-07 13:46
 **/

/**
 * 单例的含义：保证在jvm中只能有一个实例
 */
class Singleton{
    /**
     *     饿汉式 当class文件被加载的时候 就初始化对象
     */
    private static Singleton singleton = new Singleton();
    /**
     * 私有化构造方法 不能直接new
     */
    private Singleton(){

    }

    public static Singleton getSingleton2(){
        return singleton;
    }

    /**
     * 提供方法，保证返回一个实例
     * 2.方法加上synchronized 只能允许一个线程访问getSingleton方法，保证了线程安全问题。（效率低）
     * 3.换成双重检验锁
     * @return
     */
     public static Singleton getSingleton(){
        //第一层锁
        if(null == singleton){
            synchronized (Singleton.class){
                //第二层锁 双重检验锁  部分线程不走同步方法，提高效率。
                if(null == singleton){
                    singleton = new Singleton();

                }
            }
        }

            return singleton;
    }

    public static synchronized Singleton getSingleton3() {
        if (null == singleton) {
            singleton = new Singleton();

        }
        return singleton;
    }


}


public class Test {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton2();
        Singleton singleton2 = Singleton.getSingleton2();

        System.out.println(singleton1==singleton2);
    }
}
