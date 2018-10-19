package javaMedium.myCollection;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author JonnyNan
 * @date 2018/10/11 - 10:55
 */
public class TestArrayList {

    @Test
    /**
     * 数组的弊端
     */
    public void m1(){
        //数组的局限性
        Hero[] heros = new Hero[10];
        //声明长度是10的数组
        //不用的数组就浪费了
        //超过10的个数，又放不下
        heros[0] = new Hero("garen");
        //放不下要报错
        heros[20] = new Hero("teemo");
    }

    /**
     * 为了解决数组的局限性，引入容器类的概念。 最常见的容器类就是
     * ArrayList
     * 容器的容量"capacity"会随着对象的增加，自动增长
     * 只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。
     */
    @Test
    public void m2(){
//        @SuppressWarnings("rawtypes")
        ArrayList heros = new ArrayList();
        heros.add(new Hero("盖伦"));
        System.out.println(heros.size());

        //容器的容量"capacity"会随着对象的增加，自动增长
        //只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。
        heros.add( new Hero("提莫"));
        System.out.println(heros.size());
    }

    /**
     * add 的两种方法
     */
    @Test
    public void m3(){
        ArrayList heros = new ArrayList();

        // 把5个对象加入到ArrayList中
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        System.out.println(heros);

        // 在指定位置增加对象
        Hero specialHero = new Hero("special hero");
        heros.add(3, specialHero);

        System.out.println(heros.toString());
    }

    /**
     * 通过方法contains 判断一个对象是否在容器中
     * 判断标准： 是否是同一个对象，而不是name是否相同
     */
    @Test
    public void m4(){
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i <5 ; i++) {
            heros.add(new Hero("hero"+i));
        }

        Hero specialHero = new Hero("specialHero ");
        heros.add(specialHero);

        // 判断一个对象是否在容器中
        // 判断标准： 是否是同一个对象，而不是name是否相同
        System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
        System.out.println(heros.contains(new Hero("hero 1")));
        System.out.print("而对specialHero的判断，contains的返回是:");
        System.out.println(heros.contains(specialHero));
    }

    /**
     *通过get获取指定位置的对象，如果输入的下标越界，一样会报错
     */
    @Test
    public void m5(){
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        //获取指定位置的对象
        System.out.println(heros.get(5));
        //如果超出了范围，依然会报错
        System.out.println(heros.get(6));
    }

    /**
     * indexOf用于判断一个对象在ArrayList中所处的位置
     与contains一样，判断标准是对象是否相同，而非对象的name值是否相等
     */
    @Test
    public void m6(){
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        System.out.println(heros);
        System.out.println("specialHero所处的位置:"+heros.indexOf(specialHero));
        System.out.println("新的英雄，但是名字是\"hero 1\"所处的位置:"+heros.indexOf(new Hero("hero 1")));



    }


    @Test
    public void m7(){

        ArrayList heros = new ArrayList();

        for (int i = 0; i <5 ; i++) {
            heros.add(new Hero("hero "+i));
        }

        Hero newHero = new Hero("special hero");
        heros.add(newHero);

        System.out.println(heros);

        heros.remove(2);
        System.out.println(heros);
        heros.remove(newHero);
        System.out.println(heros);
    }

    @Test
    public void m8(){
        ArrayList heros = new ArrayList();

        for (int i = 0; i <5 ; i++) {
            heros.add(new Hero("hero "+i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        System.out.println(heros);
        System.out.println("修改下标为3的元素，换成hero \"6\"");
        heros.set(3,new Hero("hero 6"));
        System.out.println(heros);
        System.out.println(heros.size());
    }

    /**
     * toArray可以把一个ArrayList对象转换为数组。
     * 需要注意的是，如果要转换为一个Hero数组，那么需要传递一个Hero数组类型的对象给toArray()，
     * 这样toArray方法才知道，你希望转换为哪种类型的数组，否则只能转换为Object数组
     */
    @Test
    public void m9(){
        ArrayList heros = new ArrayList();

        for (int i = 0; i <5 ; i++) {
            heros.add(new Hero("hero "+i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        Hero[] heroes = (Hero[]) heros.toArray(new Hero[]{});
        System.out.println(heroes);
    }

    @Test
    public void m10(){
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }

        System.out.println("ArrayList heros:\t" + heros);

        //把另一个容器里所有的元素，都加入到该容器里来
        ArrayList anotherHeros = new ArrayList();
        anotherHeros.add(new Hero("hero a"));
        anotherHeros.add(new Hero("hero b"));
        anotherHeros.add(new Hero("hero c"));
        System.out.println("anotherHeros heros:\t" + anotherHeros);
        heros.addAll(anotherHeros);
        System.out.println("把另一个ArrayList的元素都加入到当前ArrayList:");
        System.out.println("ArrayList heros:\t" + heros);
        heros.clear();
        System.out.println(heros);
    }

    @Test
    public void test1(){
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }

        System.out.println("ArrayList heros:\t" + heros);

        for (Object o:heros
             ) {
            Hero hero = (Hero)(o);
            if ("hero 1".equals(hero.name)){
                System.out.printf("找到了name是%s的对象",hero.name);
            }
        }
    }

    @Test
    public void bianli(){
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }

        for (int i = 0; i <heros.size() ; i++) {
            System.out.println(heros.get(i));
        }

        System.out.println("--------使用while的iterator-------");
        Iterator<Hero> it = heros.iterator();

        while (it.hasNext()){
            Hero h = it.next();
            System.out.println(h);
        }

        System.out.println("--------使用for的iterator-------");
        for (Iterator iterator = heros.iterator(); iterator.hasNext();){
            Hero hero = (Hero) iterator.next();
            System.out.println(hero);
        }
    }

    /**
     * 首先初始化一个Hero集合，里面放100个Hero对象，名称分别是从
     * hero 0
     * hero 1
     * hero 2
     * ...
     * hero 99.
     *
     * 通过遍历的手段，删除掉名字编号是8的倍数的对象
     */
    @Test
    public void test2(){
        List heros = new ArrayList();

        for (int i = 0; i <100 ; i++) {
            heros.add(new Hero("hero "+ i));
        }

        List<Hero> heroNeedRemove = new ArrayList<>();

        for (int i = 0; i <heros.size() ; i++) {

            if(i%8==0){
                heroNeedRemove.add((Hero) heros.get(i));
            }

        }

        for (Hero h:heroNeedRemove
             ) {
            heros.remove(h);
        }

        System.out.println(heros);
    }

}
