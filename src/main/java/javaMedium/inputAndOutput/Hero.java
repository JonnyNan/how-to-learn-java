package javaMedium.inputAndOutput;

import java.io.Serializable;

/**
 * @author JonnyNan
 * @date 2018/10/9 - 11:52
 */
public class Hero implements Serializable {
    /**
     *     表示这个类当前的版本，如果有了变化，比如新设计了属性，就应该修改这个版本号
     */
    private static final long SERIAL_VERSIOUID = 1L;
    public String name;
    public float hp;
}
