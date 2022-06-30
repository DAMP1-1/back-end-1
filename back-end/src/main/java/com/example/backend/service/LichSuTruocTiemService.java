package com.example.backend.service;

import com.example.backend.model.LichSuTruocTiem;

import java.util.List;

public interface LichSuTruocTiemService {
    List<LichSuTruocTiem> listLichSuByIdTre(int id);
    List<LichSuTruocTiem> findAll();
    void themLichSu(LichSuTruocTiem lichSuTruocTiem);

}
