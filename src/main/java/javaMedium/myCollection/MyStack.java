package javaMedium.myCollection;

import java.util.LinkedList;

/**
 * @author JonnyNan
 * @date 2018/10/19 - 15:31
 */
public class MyStack implements Stack{

    LinkedList<Hero> heros = new LinkedList<>();

    @Override
    public void push(Hero h) {
        heros.addLast(h);
    }

    @Override
    public Hero pull() {
        return heros.removeLast();
    }

    @Override
    public Hero peek() {
        return heros.getLast();
    }


}
