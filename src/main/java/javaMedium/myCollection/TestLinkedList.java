package javaMedium.myCollection;

import org.testng.annotations.Test;

import java.util.LinkedList;

/**
 * @author JonnyNan
 * @date 2018/10/19 - 10:31
 */
public class TestLinkedList {

    /**
     * 除了实现了List接口外，LinkedList还实现了双向链表结构Deque，
     * 可以很方便的在头尾插入删除数据
     */
    @Test
    public void m1(){
        LinkedList<Hero> ll = new LinkedList<>();

        //linkedlist是一个双向链表结构的list，所以很方便的在头尾插入数据

        //在最后插入新的英雄
        ll.addLast(new Hero("hero1"));
        ll.addLast(new Hero("hero2"));
        ll.addLast(new Hero("hero3"));
        System.out.println(ll);

        //在最前面插入新的英雄
        ll.addFirst(new Hero("hero X"));
        System.out.println(ll);

        //查看最前面的和最后面的元素
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);


    }
}
