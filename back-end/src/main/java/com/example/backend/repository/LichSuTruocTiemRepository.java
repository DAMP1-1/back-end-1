package com.example.backend.repository;

import com.example.backend.dto.DKTiemDto;
import com.example.backend.model.LichSuTruocTiem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LichSuTruocTiemRepository extends JpaRepository<LichSuTruocTiem,Integer> {
    @Query( value = "select  o from LichSuTruocTiem o where o.tre.idtre = ?1")
    List<LichSuTruocTiem> findAllByIdTre(int id);

//    @Query(value = "select t.tentre,l.ngaytiem,v.tenvx,his.somui as \"số mũi đã tiêm\", v.somuitoida from lichsutruoctiem as his inner join  tre as t on his.id=t.id inner join lichtiem as l on t.idtre=l.tre_idtre\n" +
//            "inner join vacxin as v on l.vacxin_mavx=v.mavx",nativeQuery = true)
//    List<LichSuTruocTiem> findAll();
//
//    @Query(value = "select t.tentre,l.ngaytiem,v.tenvx,sum(his.somui) as 'tổng số mũi tiêm', v.somuitoida from lichsutruoctiem as his inner join  tre as t on his.id=t.id inner join lichtiem as l on t.idtre=l.tre_idtre\n" +
//            "inner join vacxin as v on l.vacxin_mavx=v.mavx\n" +
//            "group by idtre;",nativeQuery = true)
//    int tongSoMuiDaTiem();
}
