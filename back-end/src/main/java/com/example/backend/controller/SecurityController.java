package com.example.backend.controller;

import com.example.backend.dto.TreDto;
import com.example.backend.dto.UserDto;
import com.example.backend.model.Role;
import com.example.backend.model.User;
import com.example.backend.service.RoleService;
import com.example.backend.service.UserService;
import com.example.backend.ultil.EncrypPasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Set;

@Controller
public class SecurityController {
    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;


    @GetMapping("/login")
    public String getLoginPage(Model model){
        return "authentication/login";
    }


    @GetMapping("/register")
    public ModelAndView getRegisterPage(){
        return new ModelAndView("authentication/register","registerUser",new UserDto());
    }
    @PostMapping("/register")
    public String registerUser(@Validated @ModelAttribute("registerUser") UserDto registerUser,BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "authentication/register";
        }else {
            User user = new User();
            user.setEmail(registerUser.getEmail());
            user.setMatkhau(EncrypPasswordUtils.EncrypPasswordUtils(registerUser.getPassword()));
            Role roleEntity = roleService.findByName("ROLE_MEMBER");
            Set<Role> listRoles = new HashSet<>();
            listRoles.add(roleEntity);
            user.setRoles(listRoles);
            user.setTenkhachhang(registerUser.getHoten());
            user.setNgaysinh(registerUser.getNgaysinh());
            user.setDantoc(registerUser.getDantoc());
            user.setAddress(registerUser.getDiachi());
            user.setGioitinh(registerUser.getGioitinh());
            user.setSdt(registerUser.getSdt());
            user.setCmnd(registerUser.getCmnd());
            user.setAddress(registerUser.getDiachi());

            userService.save(user);
            return "redirect:/login";
        }
    }

    @GetMapping("/403")
    public String getPage403(){
        return "authentication/403";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
            Cookie cookie = new Cookie("remember-me", "");
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
        return "redirect:/home";
    }
}