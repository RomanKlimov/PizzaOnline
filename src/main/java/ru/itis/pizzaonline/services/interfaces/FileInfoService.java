package ru.itis.pizzaonline.services.interfaces;

import org.springframework.web.multipart.MultipartFile;
import ru.itis.pizzaonline.models.FileInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * Date 22.04.2018
 *
 * @author Hursanov Sulaymon
 * @version v1.0
 **/
public interface FileInfoService {
    void getPicture(String fileName, HttpServletResponse response);
    FileInfo savePicture(MultipartFile multipartFile);
}
