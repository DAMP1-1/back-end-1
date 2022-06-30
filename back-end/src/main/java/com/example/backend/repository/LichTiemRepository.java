package com.example.backend.repository;

import com.example.backend.model.LichTiem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LichTiemRepository extends JpaRepository<LichTiem,Integer> {
    @Query(value = "update lichtiem set ghichu=\"da tiem\" where malt=?1;",nativeQuery = true)
    void SaveDaTiem(int id);
}
