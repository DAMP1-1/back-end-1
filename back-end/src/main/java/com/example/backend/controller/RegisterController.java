package com.example.backend.controller;

import com.example.backend.dto.TreDto;
import com.example.backend.dto.UserDto;
import com.example.backend.model.Role;
import com.example.backend.model.Tre;
import com.example.backend.model.User;
import com.example.backend.service.TreService;
import com.example.backend.service.UserService;
import com.example.backend.ultil.EncrypPasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.config.web.servlet.oauth2.login.UserInfoEndpointDsl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Pageable;
import java.security.Principal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class RegisterController {
    @Autowired
    TreService treService;
    @Autowired
    UserService userService;
    @GetMapping("/registerforchild")
    public ModelAndView getRegisterPage(Principal principal,Model model){
        Integer idUserCurrent = userService.getUserIdByEmail(principal.getName());
        List<Tre> tres= treService.findAllById(idUserCurrent);
        model.addAttribute("tres", tres);
        return new ModelAndView("authentication/themtre","registerTre",new Tre());
    }
    @PostMapping("/registerforchild")
    public String registerUser(@ModelAttribute("registerTre") Tre registerTre,BindingResult bindingResult, Principal principal){
        if (bindingResult.hasErrors()){
            return "authentication/themtre";
        }
        Integer idUserCurrent = userService.getUserIdByEmail(principal.getName());
        User user= userService.findById(idUserCurrent);
        registerTre.setUsers(user);
            treService.save(registerTre);
            return "redirect:/registerforchild";
    }

    @GetMapping("/delete")
    private String deleteTre(@RequestParam int id){
        treService.deleteById(id);
        return "redirect:/registerforchild";
    }
}
