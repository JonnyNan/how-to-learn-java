package javaWeb.myspringmvc.pojo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-09 14:43
 **/
@Data
public class UploadedImageFile {
    MultipartFile image;
}
