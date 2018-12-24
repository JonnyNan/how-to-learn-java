package javaBasic.controlFlow;
//继续下一次循环的意思
public class Continue {
    //如果是双数，后面的代码不执行，直接进行下一次循环
    public static void main(String[] args) {

        //打印单数
        for (int j = 0; j < 10; j++) {
            if(0==j%2)
                continue; //如果是双数，后面的代码不执行，直接进行下一次循环

            System.out.println(j);
        }
    }
}
