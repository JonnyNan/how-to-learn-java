package javaBasic.digitGroup.otherArray;

/**
 * 这是一个一维数组, 里面的每一个元素，都是一个基本类型int
 * <p>
 * int a[] =new int[]{1,2,3,4,5};
 * <p>
 * <p>
 * 这是一个二维数组，里面的每一个元素，都是一个一维数组
 * 所以二维数组又叫数组的数组
 * <p>
 * int b[][] = new int[][]{
 * {1,2,3},
 * {4,5,6},
 * {7,8,9}
 * };
 */


public class DyadicArray {
    public static void main(String[] args) {
        //初始化二维数组，
        int[][] a = new int[2][3]; //有两个一维数组，每个一维数组的长度是3
        a[1][2] = 5;  //可以直接访问一维数组，因为已经分配了空间

        //只分配了二维数组
        int[][] b = new int[2][]; //有两个一维数组，每个一维数组的长度暂未分配
        b[0] = new int[3]; //必须事先分配长度，才可以访问
        b[0][2] = 5;

        //指定内容的同时，分配空间
        int[][] c = new int[][]{
                {1, 2, 4},
                {4, 5},
                {6, 7, 8, 9}
        };

    }
}
