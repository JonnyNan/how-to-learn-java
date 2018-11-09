package javaWeb.myspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-09 11:29
 **/
@Controller
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse
    ) throws Exception {

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message","Hello Spring MVC");
        return mav;
    }

    @RequestMapping("/jump")
    public ModelAndView jump(){
        ModelAndView modelAndView = new ModelAndView("redirect:/index");
        return modelAndView;
    }

    @RequestMapping("/check")
    public ModelAndView check(HttpSession session){
        Integer i = (Integer) session.getAttribute("count");
        if(null==i){
            i = 0;
        }else {
            i++;
        }
        session.setAttribute("count",i);
        ModelAndView mav = new ModelAndView("count");
        return mav;

    }

    @RequestMapping("/clear")
    public ModelAndView clear(HttpSession session){
        Integer i = (Integer) session.getAttribute("count");
        if(i>0){
            i = 0;
        }else {
            i = 0;
        }
        session.setAttribute("count",i);
        ModelAndView mav = new ModelAndView("redirect:/check");
        return mav;
    }
}
