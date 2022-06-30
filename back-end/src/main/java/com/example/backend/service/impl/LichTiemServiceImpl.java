package com.example.backend.service.impl;

import com.example.backend.model.LichTiem;
import com.example.backend.repository.LichTiemRepository;
import com.example.backend.service.LichTiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LichTiemServiceImpl implements LichTiemService {
    @Autowired
    LichTiemRepository lichTiemRepository;
    @Override
    public void save(LichTiem lichTiem) {
        lichTiemRepository.save(lichTiem);
    }
}
