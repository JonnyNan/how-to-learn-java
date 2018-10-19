package javaMedium.myCollection;

import org.testng.annotations.Test;

/**
 * @author JonnyNan
 * @date 2018/10/19 - 17:44
 */
public class TestMyStack {

    @Test
    public void test(){

        MyStack heroStack = new MyStack();
        for (int i = 0; i < 5; i++) {
            Hero h = new Hero("hero name " + i);
            System.out.println("压入 hero:" + h);
            heroStack.push(h);
        }
        for (int i = 0; i < 5; i++) {
            Hero h =heroStack.pull();
            System.out.println("弹出 hero" + h);
        }
    }
}
