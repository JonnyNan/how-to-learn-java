package javaWeb.myspringmvc.controller;

import javaWeb.myspringmvc.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-09 14:07
 **/

@Controller
public class ProductController {

    @RequestMapping("/addProduct")
    public ModelAndView add(Product product) throws Exception{

        ModelAndView mav = new ModelAndView("showProduct");
        return mav;
    }
}
