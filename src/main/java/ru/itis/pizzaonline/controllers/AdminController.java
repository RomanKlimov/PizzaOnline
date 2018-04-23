package ru.itis.pizzaonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.itis.pizzaonline.forms.UserRegistrationForm;
import ru.itis.pizzaonline.models.FileInfo;
import ru.itis.pizzaonline.models.InviteCode;
import ru.itis.pizzaonline.models.Pizza;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.security.Role.Role;
import ru.itis.pizzaonline.services.implementations.AdminServiceImpl;
import ru.itis.pizzaonline.services.implementations.FileInfoServiceImpl;
import ru.itis.pizzaonline.services.implementations.PizzaServiceImpl;
import ru.itis.pizzaonline.utils.FileStorageUtil;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private PizzaServiceImpl pizzaService;

    @Autowired
    private AdminServiceImpl adminService;

    @Autowired
    private FileStorageUtil fileStorageUtil;

    @Autowired
    private FileInfoServiceImpl fileInfoService;

//    @Autowired
//    private PizzaFormValidator pizzaFormValidator;
//
//    @Autowired
//    private UserRegistrationFormValidator userRegistrationFormValidator;
//
//    @InitBinder("userForm")
//    public void initPizzaValidator(WebDataBinder dataBinder){
//        dataBinder.addValidators( userRegistrationFormValidator);
//    }

    @GetMapping("/clients")
    public String getClientsPage(ModelMap modelMap){
        List<User> users = adminService.getAllUsersByRole(Role.CLIENT);
        modelMap.addAttribute("users", users);
        return "admin/clients";
    }

    @PostMapping("/addUser")
    public String addUser(@Valid @ModelAttribute("userForm") UserRegistrationForm userRegistrationForm, BindingResult errors, RedirectAttributes attributes){
        if (errors.hasErrors())
            attributes.addFlashAttribute("errors", errors.getAllErrors().get(0).getDefaultMessage());
        else {
            User user = User.builder()
                    .name(userRegistrationForm.getName())
                    .email(userRegistrationForm.getEmail())
                    .phoneNumber(userRegistrationForm.getPhoneNumber())
                    .role(userRegistrationForm.getRole())
                    .build();
            adminService.addUser(user);
        }
        if(userRegistrationForm.getRole().equals(Role.CLIENT))
            return "redirect:/admin/clients";
        else
            return "redirect:/admin/couriers";
    }

    @GetMapping("/couriers")
    public String getCouriersPage(@ModelAttribute("model")ModelMap modelMap){
        List<User> users = adminService.getAllUsersByRole(Role.COURIER);
        modelMap.addAttribute("users", users);
        return "admin/couriersPage";
    }

    @GetMapping("/pizzas")
    public String getPizzas(@ModelAttribute("model")ModelMap modelMap){
        List<Pizza> pizzas = adminService.getAllPizzas();
        modelMap.addAttribute("pizzas", pizzas);
        return "admin/pizzasPage";
    }

    @PostMapping(value = "/addPizza", consumes = "multipart/form-data")
    public String addPizza(@Valid @ModelAttribute("pizzaForm") Pizza pizza, BindingResult errors, RedirectAttributes attributes,
                           @RequestParam("file") MultipartFile file){
        if (errors.hasErrors()){
            attributes.addAttribute("errorPizza", errors.getAllErrors().get(0).getDefaultMessage());
            return "redirect:/admin/pizzas";
        }
        if (file.getSize()>0){
            FileInfo fileInfo = fileInfoService.savePicture(file);
            pizza.setImageUrl(fileInfo.getFileName());
        }
        pizzaService.addPizza(pizza);
        return "redirect:/admin/pizzas";
    }

    @PostMapping("/deleteUser")
    public String deleteUser(@RequestParam(value = "email", required = true) String email){
        User user = adminService.deleteUser(email);
        if (user.getRole().equals(Role.CLIENT))
            return "redirect:/admin/clients";
        else
            return "redirect:/admin/couriers";
    }


    @PostMapping("/inviteCourier")
    public String inviteCourier(@RequestParam("forName") String forName){
        adminService.generateInviteCode(forName);
        return "redirect:/inviteCourier";
    }

    @GetMapping("/inviteCourier")
    public String getInviteCourierPage(ModelMap modelMap){
        List<InviteCode> inviteCodes = adminService.getAllInviteCode();
        modelMap.addAttribute("inviteCodes", inviteCodes);
        return "inviteCourierPage";
    }

}
