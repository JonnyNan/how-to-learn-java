package javaMedium.myCollection;

import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * @author JonnyNan
 * @date 2018/10/24 - 2:49
 */
public class TestHashMap {

    @Test
    public void m1(){
        HashMap<String,String> dictionary = new HashMap<>();

        dictionary.put("adc","物理英雄");
        dictionary.put("apc","魔法英雄");
        dictionary.put("t","坦克");

        System.out.println(dictionary.get("td"));
    }
}
