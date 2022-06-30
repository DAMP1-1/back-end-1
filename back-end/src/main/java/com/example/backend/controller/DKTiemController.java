package com.example.backend.controller;

import com.example.backend.dto.DKTiemDto;
import com.example.backend.dto.LichTiemDto;
import com.example.backend.dto.ThongTin;
import com.example.backend.model.*;
import com.example.backend.repository.VacXinRepository;
import com.example.backend.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;

@Controller
public class DKTiemController {
    @Autowired
    TreService treService;
    @Autowired
    UserService userService;
    @Autowired
    LichSuTruocTiemService lichSuTruocTiemService;
    @Autowired
    VacXinService vacXinService;
    @Autowired
    VacXinRepository vacXinRepository;
    @Autowired
    LichTiemService lichTiemService;

    @GetMapping("/dktiemchung")
    public String DKTiemChung(Principal principal, Model model){
        Integer idUserCurrent = userService.getUserIdByEmail(principal.getName());
        List<Tre> tres= treService.findAllById(idUserCurrent);
        List<LichSuTruocTiem> lichSuTruocTiems = lichSuTruocTiemService.findAll();
        List<VacXin> listVacXin= vacXinService.findAll();
        List<ThongTin> dk= vacXinRepository.test();
        model.addAttribute("dk",dk);
        model.addAttribute("lichsu", lichSuTruocTiems);
        model.addAttribute("tres", tres);
        model.addAttribute("listvacxin", listVacXin);
        model.addAttribute("lichtiem", new LichTiemDto());
        return "content/dangkitiem";
    }
    @PostMapping("/dktiemchung")
    public String DkTiem(@RequestParam("mavx1") String mavx1,@RequestParam("idtre1") String idtre1, @ModelAttribute("lichtiem")LichTiemDto lichtiem, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "content/dangkitiem";
        }
        int idtre= treService.findTreByName(idtre1);
        int mavx= vacXinService.findVacXinByName(mavx1);
        LichTiem lt= new LichTiem();
        lt.setTre(treService.findTreById(idtre));
        lt.setNgaytiem(lichtiem.getNgaytiem());
        lt.setMuitiem(1);
        lt.setGhichu("chua tiem");
        lt.setVacxin(vacXinService.findVacXinById(mavx));
        lichTiemService.save(lt);
        return  "redirect:/dktiemchung";
    }
}
