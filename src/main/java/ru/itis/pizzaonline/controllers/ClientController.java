package ru.itis.pizzaonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import ru.itis.pizzaonline.models.FileInfo;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.services.implementations.AuthenticationServiceImpl;
import ru.itis.pizzaonline.services.implementations.FileInfoServiceImpl;
import ru.itis.pizzaonline.services.interfaces.UserService;

/**
 * Date 30.04.2018
 *
 * @author Hursanov Sulaymon
 * @version v1.0
 **/
@Controller
public class ClientController {
    @Autowired
    private FileInfoServiceImpl fileInfoService;

    @Autowired
    private AuthenticationServiceImpl authenticationService;

    @Autowired
    private UserService userService;

    @PostMapping(value = "/uploadImageProfile", consumes  = "multipart/form-data")
    @ResponseBody
    public ResponseEntity uploadImageProfile(@RequestParam("file")MultipartFile file, Authentication authentication){
        if (authentication != null){
            User user = authenticationService.getUserByAuthentication(authentication);
            if (file.getSize()>0){
                FileInfo fileInfo = fileInfoService.savePicture(file);
                user.setImageUrl(fileInfo.getFileName());
                userService.updateUser(user);
            }
        }
        return ResponseEntity.ok().build();
    }

}
