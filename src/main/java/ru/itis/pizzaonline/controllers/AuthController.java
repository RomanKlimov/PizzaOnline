package ru.itis.pizzaonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.security.Role.Role;
import ru.itis.pizzaonline.services.implementations.AuthenticationServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AuthController {


    @Autowired
    private AuthenticationServiceImpl service;

    @GetMapping("/")
    public String login(Authentication authentication, HttpServletRequest request){
        if (authentication!=null){
            User user = service.getUserByAuthentication(authentication);
            request.getSession().setAttribute("user", user);
            if (user.getRole().equals(Role.CLIENT)) {
                return "redirect:/user/profile";
            }
            else if (user.getRole().equals(Role.ADMIN)){
                return "redirect:/admin/users";
            }
        }
        return "redirect:/home";
    }
    @GetMapping("/user/profile")
    public String userProfile(HttpServletRequest servletRequest,Authentication authentication, ModelMap modelMap) {
        if (authentication != null) {
            User user = service.getUserByAuthentication(authentication);
            modelMap.addAttribute("user",user);
            servletRequest.getSession().setAttribute("isLogin",Boolean.TRUE);
            return "client/userProfile";
        }
        return "redirect:/home";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, Authentication authentication){
        if (authentication != null){
            request.getSession().invalidate();
        }
        return "redirect:/home";
    }

}
