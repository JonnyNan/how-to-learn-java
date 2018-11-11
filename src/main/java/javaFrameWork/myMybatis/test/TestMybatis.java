package javaFrameWork.myMybatis.test;

import javaFrameWork.myMybatis.pojo.Category;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-09 16:14
 **/
public class TestMybatis {

    @Test
    public void m1() throws IOException {
        InputStream ins = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ins);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<Category> categoryList = sqlSession.selectList("listCategory");

        for (Category category:categoryList
             ) {
            System.out.println(category.getName());
        }
    }
}
