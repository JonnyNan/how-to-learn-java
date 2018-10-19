package javaMedium.myCollection;


/**
 * @author JonnyNan
 * @date 2018/10/9 - 11:52
 */
public class Hero {

    private static final long SERIAL_VERSIOUID = 1L;
    public String name;
    public float hp;

    public Hero(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }
}
