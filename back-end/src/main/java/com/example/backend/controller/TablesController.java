package com.example.backend.controller;

import com.example.backend.dto.ThongTin;
import com.example.backend.dto.ThongTinTreAdmin;
import com.example.backend.repository.LichTiemRepository;
import com.example.backend.repository.VacXinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TablesController {
    @Autowired
    VacXinRepository vacXinRepository;
    @Autowired
    LichTiemRepository lichTiemRepository;

    @GetMapping("/table")
    public String chart(Model model){
        List<ThongTin> dk= vacXinRepository.test();
        model.addAttribute("dk",dk);
        List<ThongTinTreAdmin> tt= vacXinRepository.test2();
        model.addAttribute("tt",tt);
        return "/admin/tables";
    }

    @PostMapping("/savedatiemchung")
    public String DaTiemChung(@RequestParam("idmalt") String id){
        int id1= Integer.parseInt(id);
        lichTiemRepository.SaveDaTiem(id1);
        return "redirect:/table";
    }
}
