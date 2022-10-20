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
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

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
        model.addAttribute("todaysDate", LocalDate.now());

        //TODO: make it come from database
        Map<LocalDate, List<LocalTime>> dates = Map.of(
                LocalDate.now(), List.of(LocalTime.of(9,0)),
                LocalDate.now().plusDays(2), List.of(LocalTime.of(9,0),LocalTime.of(11,0))
        );
        model.addAttribute("times", dates);
        //TODO: remove it
        return "scheduling";
    }

    @PostMapping
    public String createScheduling(@ModelAttribute("scheduleInfo") ScheduleDTO scheduleDTO, Principal principal){
        System.out.println(scheduleDTO);
        return "redirect:/home";
    }
}
