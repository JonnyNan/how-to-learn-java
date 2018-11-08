package javaFrameWork.myspring.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-08 15:54
 **/

@Data
@Component
public class Product {
    private Integer id;
    private String name = "product 1";

    @Resource(name="category")
    private Category category;
}
