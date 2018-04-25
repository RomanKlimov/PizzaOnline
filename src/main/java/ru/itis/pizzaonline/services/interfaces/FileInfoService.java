package ru.itis.pizzaonline.services.interfaces;

import org.springframework.web.multipart.MultipartFile;
import ru.itis.pizzaonline.models.FileInfo;

import javax.servlet.http.HttpServletResponse;


public interface FileInfoService {
    void getPicture(String fileName, HttpServletResponse response);
    FileInfo savePicture(MultipartFile multipartFile);
}
