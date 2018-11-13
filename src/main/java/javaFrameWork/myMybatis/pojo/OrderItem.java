package javaFrameWork.myMybatis.pojo;

import lombok.Data;
/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-13 10:05
 **/

@Data
public class OrderItem {
    private Integer id;
    private Integer number;
    private Order order;
    private Product product;
}
