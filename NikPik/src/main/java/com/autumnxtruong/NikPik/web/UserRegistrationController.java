package com.autumnxtruong.NikPik.web;

import com.autumnxtruong.NikPik.dao.iUser;
import com.autumnxtruong.NikPik.web.dto.UserRegistrationDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private iUser userService;

    public UserRegistrationController(iUser userService) {
        super();
        this.userService = userService;
    }
//
//    @ModelAttribute("user")
//    public UserRegistrationDto userRegistrationDto() {
//        return new UserRegistrationDto();
//    }

    @GetMapping
    public String showRegistrationForm(Model model) {
        UserRegistrationDto userRegistrationDto = new UserRegistrationDto();
        model.addAttribute("user",userRegistrationDto);
        model.addAttribute("firstName",userRegistrationDto.getFirstName());
        model.addAttribute("lastName",userRegistrationDto.getLastName());
        model.addAttribute("email",userRegistrationDto.getEmail());
        model.addAttribute("password",userRegistrationDto.getPassword());
        return "registration";
    }
//
//    @GetMapping
//    public String showRegistrationForm() {
//        return "registration";
//    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
        userService.save(registrationDto);
        return "redirect:/registration?success";
    }
}