package javaFrameWork.myMybatis.pojo;

import lombok.Data;

import java.util.List;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-09 16:07
 **/

@Data
public class Category {
     private Integer id;
     private String name;
     private List<Product> productList;
}
