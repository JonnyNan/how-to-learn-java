package javaMedium.myCollection;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author JonnyNan
 * @date 2018/10/19 - 10:54
 */
public class TestCollection {

    /**
     * LinkedList 除了实现了List和Deque外，还实现了Queue接口(队列)。
     * Queue是先进先出队列 FIFO，常用方法：
     * offer 在最后添加元素
     * poll 取出第一个元素
     * peek 查看第一个元素
     */
    @Test
    public void m1(){
        List ll = new LinkedList<Hero>();

        //所不同的是LinkedList还实现了Deque，进而又实现了Queue这个接口
        //Queue代表FIFO 先进先出的队列
        Queue<Hero> queue = new LinkedList<>();

        //加在队列的最后面
        System.out.println("初始化队列:\t");

        queue.offer(new Hero("Hero1"));
        queue.offer(new Hero("Hero2"));
        queue.offer(new Hero("Hero3"));
        queue.offer(new Hero("Hero4"));

        System.out.println(queue);
        System.out.println("取出第一个");
        Hero h = queue.poll();
        System.out.println(h.name);
        System.out.println("第一个取出来之后");
        System.out.println(queue);
//把第一个拿出来看一看，但是不取出来
        h=queue.peek();
        System.out.print("查看peek()第一个元素:\t");
        System.out.println(h);
        System.out.print("查看并不会导致第一个元素被取出来:\t");
        System.out.println(queue);


    }


}
