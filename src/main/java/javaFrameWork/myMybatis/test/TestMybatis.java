package javaFrameWork.myMybatis.test;

import javaFrameWork.myMybatis.pojo.Category;
import javaFrameWork.myMybatis.pojo.Product;
import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-09 16:14
 **/
public class TestMybatis {

    @Test
    public void testListCategory() throws IOException {
        InputStream ins = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ins);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<Category> categoryList = sqlSession.selectList("listCategory");

        for (Category category : categoryList
        ) {
            System.out.println(category.getName());
        }
    }

    @Test
    public void testAddCategory() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();


        Category category = new Category();
        category.setName("我是增加的种类名");
        sqlSession.insert("addCategory", category);

        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void testDelCategory() throws IOException {
        InputStream ins = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(ins);
        SqlSession sqlSession = sessionFactory.openSession();


        Category category = new Category();
        category.setId(5);
        sqlSession.delete("delCategory", category);

        sqlSession.commit();
        sqlSession.close();


    }

    @Test
    public void getCategory() throws IOException {
        InputStream ins = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(ins);
        SqlSession sqlSession = sessionFactory.openSession();

        Category category = sqlSession.selectOne("getCategoryById", 3);

        System.out.println(category.toString());

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void ListCategoryByName() throws IOException {
        InputStream ins = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(ins);
        SqlSession sqlSession = sessionFactory.openSession();

        List<Category> categoryList = sqlSession.selectList("listCategoryByName","新");

        for (Category category: categoryList
             ) {
            System.out.println(category.toString());
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void ListCategoryByIdAndName() throws IOException {
        InputStream ins = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(ins);
        SqlSession sqlSession = sessionFactory.openSession();


        Map<String,Object> params = new HashMap<>();
        params.put("id",3);
        params.put("name","新");

        List<Category> categoryList = sqlSession.selectList("listCategoryByIdAndName",params);

        for (Category category: categoryList
        ) {
            System.out.println(category.toString());
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testListCategoryWithProduct() throws IOException {
        InputStream ins = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(ins);
        SqlSession sqlSession = sessionFactory.openSession();



        List<Category> categoryList = sqlSession.selectList("listCategoryWithProduct");

        for (Category category: categoryList
        ) {
            System.out.println(category);
            List<Product> productList = category.getProductList();
            for(Product product:productList){
                System.out.println(product);
            }
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testListProductWithCategory() throws IOException {
        InputStream ins = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(ins);
        SqlSession sqlSession = sessionFactory.openSession();



        List<Product> productList = sqlSession.selectList("listProductWithCategory");

        for (Product product:productList
             ) {
            System.out.println(product+"对应的分类是："+product.getCategory());
        }

    }



}
