package ru.itis.pizzaonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.security.Role.Role;
import ru.itis.pizzaonline.services.implementations.AuthenticationServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AuthController {


    @Autowired
    private AuthenticationServiceImpl service;

    @GetMapping("/")
    public String auth(Authentication authentication, HttpServletRequest request){
        if (authentication!=null){
            User user = service.getUserByAuthentication(authentication);
            request.getSession().setAttribute("user", user);
            if (user.getRole().equals(Role.CLIENT)) {
                return "redirect:/home";
            }else if (user.getRole().equals(Role.ADMIN)){
                return "redirect:/admin/pizzas";
            }else if (user.getRole().equals(Role.COURIER)){
                return "redirect:/courier";
            }
        }
        return "redirect:/home";
    }

    @GetMapping("/user/profile")
    public String userProfile(HttpServletRequest servletRequest,Authentication authentication, ModelMap modelMap) {
        if (authentication != null) {
            User user = service.getUserByAuthentication(authentication);
            if (user.getRole().equals(Role.CLIENT)){
                modelMap.addAttribute("user",user);
                servletRequest.getSession().setAttribute("isLogin",Boolean.TRUE);
                return "client/userProfile";
            }
            return "redirect:/admin/pizzas";
        }
        return "redirect:/home";
    }

    @GetMapping("/login")
    public String login(Authentication authentication){
        if (authentication != null){
            return "redirect:/";
        }
        return "guest/login";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, Authentication authentication){
        if (authentication != null){
            request.getSession().invalidate();
        }
        return "redirect:/home";
    }

}
