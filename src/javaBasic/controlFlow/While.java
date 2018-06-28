package javaBasic.controlFlow;

public class While {
    //while和do-while循环语句


    public static void main(String[] args) {


        //打印0到4
        int i = 0;
        //只要while中的表达式成立，就会不断地循环执行
        while(i<5){
            System.out.println(i);
            i++;
        }

        //条件为true时 重复执行，至少会执行一次

        //打印0到4
        //与while的区别是，无论是否成立，先执行一次，再进行判断
        int j = 0;
        do{
            System.out.println(j);
            j++;
        } while(j<5);

    }
}
