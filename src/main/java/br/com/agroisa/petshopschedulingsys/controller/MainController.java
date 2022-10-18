package br.com.agroisa.petshopschedulingsys.controller;

import br.com.agroisa.petshopschedulingsys.model.Client;
import br.com.agroisa.petshopschedulingsys.model.Employee;
import br.com.agroisa.petshopschedulingsys.model.dto.UserRegisterDTO;
import br.com.agroisa.petshopschedulingsys.service.UserServiceImpl;
import br.com.agroisa.petshopschedulingsys.util.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class MainController {

    private final UserServiceImpl userService;
    private final UserMapper userMapper;

    @GetMapping("/home")
    public String getHomePage(Model model, Principal principal){
        if(principal != null){
            model.addAttribute("logged", true);
        }
        return "index";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model){
        model.addAttribute("user", new UserRegisterDTO());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") UserRegisterDTO userRegisterDTO, Principal principal){
        if(principal != null){
            Employee employee = userMapper.fromRegisterToUser(userRegisterDTO, Employee.class);
            userService.registerUser(employee);
            return "redirect: /lists";
        }
        Client client = userMapper.fromRegisterToUser(userRegisterDTO, Client.class);
        userService.registerUser(client);
        return "redirect: /login";
    }

}
