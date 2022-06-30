package com.example.backend.service.impl;

import com.example.backend.model.LichSuTruocTiem;
import com.example.backend.repository.LichSuTruocTiemRepository;
import com.example.backend.service.LichSuTruocTiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LichSuTruocTiemImpl implements LichSuTruocTiemService {

    @Autowired
    private LichSuTruocTiemRepository lichSuTruocTiemRepository;

    @Override
    public List<LichSuTruocTiem> listLichSuByIdTre(int id) {
        return lichSuTruocTiemRepository.findAllByIdTre(id);
    }

    @Override
    public List<LichSuTruocTiem> findAll() {
        return lichSuTruocTiemRepository.findAll();
    }

    @Override
    public void themLichSu(LichSuTruocTiem lichSuTruocTiem) {

    }
}
