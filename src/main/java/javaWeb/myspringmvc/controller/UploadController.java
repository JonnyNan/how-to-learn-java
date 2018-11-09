package javaWeb.myspringmvc.controller;

import javaWeb.myspringmvc.pojo.UploadedImageFile;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-09 14:44
 **/
@Controller
public class UploadController {

    @RequestMapping("/uploadImage")
    public ModelAndView upload(HttpServletRequest request, UploadedImageFile file) throws IOException {
        String randomName = RandomStringUtils.randomAlphabetic(10);
        String fileName = randomName+".jpg";
        File newFile = new File(request.getServletContext().getRealPath("/image"),fileName);
        newFile.getParentFile().mkdirs();
        file.getImage().transferTo(newFile);

        ModelAndView mav = new ModelAndView("showUploadedFile");
        mav.addObject("imageName",fileName);
        return mav;
    }
}
