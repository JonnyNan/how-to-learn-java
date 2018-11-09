package javaFrameWork.myspring.test;

import javaFrameWork.myspring.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-09 10:07
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringForTest {
    @Autowired
    Category c;

    @Test
    public void test(){
        System.out.println(c.getName());
    }
}
