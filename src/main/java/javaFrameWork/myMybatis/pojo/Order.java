package javaFrameWork.myMybatis.pojo;

import lombok.Data;

import java.util.List;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-13 10:06
 **/

@Data
public class Order {
    private Integer id;
    private String code;
    List<OrderItem> orderItems;
}
