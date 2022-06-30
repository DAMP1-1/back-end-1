package com.example.backend.service;


import com.example.backend.model.VacXin;

import java.util.List;

public interface VacXinService {
    List<VacXin> findInForVacXinByLichTiem(int id);
    VacXin findInForVacXinByIdTre(int id);
    List<VacXin> findAll();
    VacXin findVacXinById(int id);

    int findVacXinByName(String mavx1);
}
