package javaMedium.myCollection;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author JonnyNan
 * @date 2018/10/24 - 2:53
 */
public class TestCollections {

    /**
     * Collection VS Collections
     *Collection是一个接口 Set--SortedSet List Queue Deque  实现了 此接口
     * Queue: 先进先出队列
     * Deque: 双向链表
     *
     *Collections是一个类，容器的工具类,就如同Arrays是数组的工具类
     */
    @Test
    public void m1(){
        /**
         * reverse 使List中的数据发生翻转
         */
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据：");
        System.out.println(numbers);

        Collections.reverse(numbers);
        System.out.println("反转后集合中的数据:");
        System.out.println(numbers);

        Collections.shuffle(numbers);
        System.out.println("乱序后的数据");
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println("排序后的数据");
        System.out.println(numbers);

        Collections.swap(numbers,2,3);
        System.out.println("交换下标2和3元素的位置");
        System.out.println(numbers);

        Collections.rotate(numbers,2);
        System.out.println("向右滚动数据2个");
        System.out.println(numbers);
    }

    /**
     * 线程安全化
     * synchronizedList 把非线程安全的List转换为线程安全的List。
     */
    @Test
    public void m2(){
        List<Integer> numbers = new ArrayList<>();

        System.out.println("把非线程安全的List转换为线程安全的List");
        List<Integer> synchronizedNumbers = (List<Integer>) Collections.synchronizedList(numbers);
    }

    /**
     * 首先初始化一个List,长度是10，值是0-9。
     * 然后不断的shuffle，直到前3位出现
     * 3 1 4
     *
     * shuffle 1000,000 次，统计出现的概率
     */
    @Test
    public void test(){
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            numbers.add(i);
        }

        int count = 0;
        for (int i = 0; i <1000*1000 ; i++) {
            Collections.shuffle(numbers);
            if(numbers.get(0)==3&&numbers.get(1)==1&&numbers.get(2)==4){
                count++;
            }
        }

        System.out.println("出现了"+count+"多次314");
        System.out.println("概率"+(double)(count)/(1000*1000));
    }



}
