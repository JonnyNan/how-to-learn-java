package javaDesignPattern.agent;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-12-07 16:07
 **/
interface House{
    void sellHouse();
}

/**
 * 买房的人
 */
class Nanzhang implements House{
    @Override
    public void sellHouse() {
        System.out.println("我是南璋，终于可以买房了");
    }
}


/**
 * 静态代理 最大的缺点，要生成代理类。换个代理对象还要修改代理类。
 */
class Proxy implements House{

    //代理对象
    private Nanzhang nanzhang;

    public Proxy(Nanzhang nanzhang){
        this.nanzhang = nanzhang;
    }
    @Override
    public void sellHouse() {
        System.out.println("我是中介，你买房开始交给我了");
        nanzhang.sellHouse();
        System.out.println("我是中介，你买房结束了");
    }
}


class JdkProxy implements InvocationHandler{
    private Object target;
    public JdkProxy(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是中介，你买房开始交给我了");
        Object invoke = method.invoke(target, args);
        System.out.println("我是中介，你买房结束了");
        return invoke;
    }
}

    /**
     *     cglib 动态代理
     */
class Cglib implements MethodInterceptor{
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是中介，你买房开始交给我了");
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        System.out.println("我是中介，你买房结束了");
        return invokeSuper;
    }
}

public class Test {
    public static void main(String[] args) {
//        Proxy proxy = new Proxy(new Nanzhang());
//        proxy.sellHouse();
        Nanzhang nanzhang = new Nanzhang();
//        JdkProxy jdkProxy = new JdkProxy(nanzhang);
//        House house = (House) java.lang.reflect.Proxy.newProxyInstance(nanzhang.getClass().getClassLoader(),nanzhang.getClass().getInterfaces(),jdkProxy);
//        house.sellHouse();

        Cglib cglib =new Cglib();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Nanzhang.class);
        enhancer.setCallback(cglib);
        House house = (House) enhancer.create();
        house.sellHouse();
    }
}
