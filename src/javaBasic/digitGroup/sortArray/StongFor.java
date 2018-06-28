package javaBasic.digitGroup.sortArray;

public class StongFor {
    //增强型for循环在遍历一个数组的时候会更加快捷

    public static void main(String[] args) {
        int values [] = new int[]{18,62,68,82,65,9};
        //常规遍历
        for (int i = 0; i < values.length; i++) {
            int each = values[i];
            System.out.println(each);
        }

        //增强型for循环遍历
        for (int each : values) {
            System.out.println(each);
        }

    }
}
