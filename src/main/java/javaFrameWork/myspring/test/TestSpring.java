package javaFrameWork.myspring.test;

import javaFrameWork.myspring.pojo.Category;
import javaFrameWork.myspring.pojo.Product;
import javaFrameWork.myspring.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @description:
 * @author: JonnyNan
 * @create: 2018-11-08 15:27
 **/

public class TestSpring {

    @Test
    public void m1(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

        Category category = (Category) context.getBean("category");

        System.out.println(category.getName());

        Product product = (Product) context.getBean("product");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getCategory().getName());
    }

    @Test
    public void m2(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        ProductService productService = (ProductService) context.getBean("productService");
        productService.doSomeService();
    }
}
