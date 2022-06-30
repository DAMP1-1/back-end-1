package com.example.backend.service.impl;

import com.example.backend.model.VacXin;
import com.example.backend.repository.VacXinRepository;
import com.example.backend.service.VacXinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacXinServiceImpl implements VacXinService {
    @Autowired
    VacXinRepository vacXinRepository;

    @Override
    public List<VacXin> findInForVacXinByLichTiem(int id) {
        return vacXinRepository.findInForVacXinByLichTiem(id);
    }

    @Override
    public VacXin findInForVacXinByIdTre(int id) {
        return vacXinRepository.findInForVacXinByIdTre(id);
    }

    @Override
    public List<VacXin> findAll() {
        return vacXinRepository.findAll();
    }

    @Override
    public VacXin findVacXinById(int id) {
        return vacXinRepository.findVacXinById(id);
    }

    @Override
    public int findVacXinByName(String mavx1) {
        return vacXinRepository.findVacXinIdByName(mavx1);
    }
}
