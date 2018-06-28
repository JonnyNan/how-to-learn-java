package javaBasic.digitGroup.arraysTool;

import java.util.Arrays;

//Arrays是针对数组的工具类，可以进行 排序，查找，复制填充等功能。
// 大大提高了开发人员的工作效率。
public class ArraysTool {

    //复制数组
    public void method(){
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };

        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a, 0, 3);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    //数组转换成字符串
    /**
     * 如果要打印一个数组的内容，就需要通过for循环来挨个遍历，逐一打印
     *
     * 但是Arrays提供了一个toString()方法，直接把一个数组，转换为字符串，这样方便观察数组的内容
     */

    public void method1(){
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        String content = Arrays.toString(a);
        System.out.println(content);

    }
}
