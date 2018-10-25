package javaMedium.MutiThread;

import org.testng.annotations.Test;

/**
 * @author JonnyNan
 * @date 2018/10/24 - 11:47
 */
public class TestThread {

    /**
     * 单线程
     */
    @Test
    public void m1(){
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        //盖伦攻击提莫
        while(!teemo.isDead()){
            gareen.attackHero(teemo);
        }

        //赏金猎人攻击盲僧
        while(!leesin.isDead()){
            bh.attackHero(leesin);
        }

    }

    /**
     * 继承Thread 实现多线程
     */
    @Test
    public void m2(){
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        KillThread killThread1 = new KillThread(gareen,teemo);
        KillThread killThread2 = new KillThread(bh,leesin);

        killThread1.start();
        killThread2.start();
    }

    /**
     *     实现runnable接口实现多线程
     */
    @Test
    public void m3(){
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        Battle battle1 = new Battle(gareen,teemo);
        Battle battle2 = new Battle(bh,leesin);

        new Thread(battle1).start();
        new Thread(battle2).start();
    }

    /**
     * 匿名内部类的方式
     */
    @Test
    public void m4(){

        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        final Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        Thread t1 = new Thread(){
            @Override
            public void run() {
                while (!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };

        t1.start();


        Thread t2 = new Thread(){
            @Override
            public void run() {
                while (!bh.isDead()){
                    leesin.attackHero(bh);
                }
            }
        };

        t2.start();
    }

}
