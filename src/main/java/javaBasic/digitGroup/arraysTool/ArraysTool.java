package javaBasic.digitGroup.arraysTool;

import java.util.Arrays;

//Arrays是针对数组的工具类，可以进行 排序，查找，复制填充等功能。
// 大大提高了开发人员的工作效率。
public class ArraysTool {

    //复制数组
    public void method() {
        int a[] = new int[]{18, 62, 68, 82, 65, 9};

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
     * <p>
     * 但是Arrays提供了一个toString()方法，直接把一个数组，转换为字符串，这样方便观察数组的内容
     */

    public void method1() {
        int a[] = new int[]{18, 62, 68, 82, 65, 9};
        String content = Arrays.toString(a);
        System.out.println(content);

    }

    //排序
    //在前面章节学习了 选择法排序 和 冒泡法排序，Arrays工具类提供了一个sort方法，只需要一行代码即可完成排序功能。
    public void method2() {
        int a[] = new int[]{18, 62, 68, 82, 65, 9};
        System.out.println("排序之前 :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(a));
    }

    /**
     * 查询元素出现的位置
     * 需要注意的是，使用binarySearch进行查找之前，必须使用sort进行排序
     * 如果数组中有多个相同的元素，查找结果是不确定的
     */

    public void method3() {
        int a[] = new int[]{18, 62, 68, 82, 65, 9};

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62出现的位置:" + Arrays.binarySearch(a, 62));
    }


    /**
     * 比较两个数组的内容是否一样
     * 第二个数组的最后一个元素是8，和第一个数组不一样，所以比较结果是false
     */
    public void method4() {
        int a[] = new int[]{18, 62, 68, 82, 65, 9};
        int b[] = new int[]{18, 62, 68, 82, 65, 8};

        System.out.println(Arrays.equals(a, b));
    }

    //使用同一个值，填充整个数


    public void method5() {
        int a[] = new int[10];

        Arrays.fill(a, 5);

        System.out.println(Arrays.toString(a));

    }

}
