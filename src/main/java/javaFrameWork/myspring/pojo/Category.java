package javaFrameWork.myspring.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: JonnyNan
 * @create: 2018-11-08 15:13
 **/

@Data
@Component("category")
public class Category {

    private Integer id;
    private String name = "category 1";
}
