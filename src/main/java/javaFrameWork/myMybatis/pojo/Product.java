package javaFrameWork.myMybatis.pojo;

import lombok.Data;
import org.testng.annotations.Test;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-11 14:18
 **/

@Data
public class Product {
    private int id;
    private String name;
    private float price;
    private Category category;

}
