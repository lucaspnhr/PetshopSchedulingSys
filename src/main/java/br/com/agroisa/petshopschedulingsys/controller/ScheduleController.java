package br.com.agroisa.petshopschedulingsys.controller;

import br.com.agroisa.petshopschedulingsys.model.User;
import br.com.agroisa.petshopschedulingsys.model.dto.ScheduleDTO;
import br.com.agroisa.petshopschedulingsys.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/schedule")
@AllArgsConstructor
@Slf4j
public class ScheduleController {

    private final UserServiceImpl userService;

    @GetMapping
    public String getSchedulePage(Model model, Principal principal){
        log.info("principal name {}",principal.getName());
        User userByEmail = userService.findUserByEmail(principal.getName());
        ScheduleDTO scheduleDTO = new ScheduleDTO();
        scheduleDTO.setOwnerName(String.format("%s %s",userByEmail.getFirstname(), userByEmail.getLastname()));
        model.addAttribute("scheduleInfo", scheduleDTO);
        return "scheduling";
    }

    @PostMapping
    public String createScheduling(@ModelAttribute("scheduleInfo") ScheduleDTO scheduleDTO, Principal principal){
        System.out.println(scheduleDTO);
        return "redirect:/home";
    }
}
