package ru.itis.pizzaonline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.itis.pizzaonline.models.Pizza;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping(value = "/home")
    public String home(HttpServletRequest request, @ModelAttribute("model")ModelMap modelMap, HttpServletRequest httpServletRequest){
        List<Pizza> pizzaList = (List<Pizza>) httpServletRequest.getSession().getAttribute("pizzaList");
        modelMap.addAttribute("list", pizzaList);
        return "client/home";
    }

}
