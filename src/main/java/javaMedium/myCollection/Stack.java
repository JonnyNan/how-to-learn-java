package javaMedium.myCollection;

/**
 * @author JonnyNan
 * @date 2018/10/19 - 15:07
 */
public interface Stack {

    /**
     * /把英雄推入最后位置
     * @param h
     */
     void push(Hero h);

     Hero pull();

     Hero peek();
}
