package com.example.backend.repository;

import com.example.backend.dto.DKTiemDto;
import com.example.backend.dto.ThongTin;
import com.example.backend.dto.ThongTinTreAdmin;
import com.example.backend.model.LichSuTruocTiem;
import com.example.backend.model.VacXin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VacXinRepository extends JpaRepository<VacXin,Integer> {
    @Query( value = "select  o from VacXin o where o.maVX = ?1")
    List<VacXin> findInForVacXinByLichTiem(int id);

    @Query(value = "select v.tenvx, v.somuitoida from lichsutruoctiem as his inner join  tre as t on his.id=t.id inner join lichtiem as l on t.idtre=l.tre_idtre inner join vacxin as v on l.vacxin_mavx=v.mavx where t.idtre=4 group by idtre;", nativeQuery = true)
    VacXin findInForVacXinByIdTre(int id);
    @Query(value = "select t.tentre ,l.ngaytiem ,v.tenvx ,his.somui , v.somuitoida " +
            "            from lichsutruoctiem as his inner join  tre as t on his.id=t.id " +
            "            inner join lichtiem as l on t.idtre=l.tre_idtre " +
            "            inner join vacxin as v on l.vacxin_mavx=v.mavx " +
            "            where  l.ghichu=\"da tiem\";", nativeQuery = true)
    List<ThongTin> test();
    @Query("select o from VacXin o where o.maVX=?1")
    VacXin findVacXinById(int id);
    @Query("select o.maVX from VacXin o where o.tenvx=?1")
    int findVacXinIdByName(String mavx1);

    @Query(value = "select t.idtre,t.tentre ,l.ngaytiem ,v.tenvx ,his.somui , v.somuitoida,v.mavx,l.ghichu,l.malt\n" +
            "            from lichsutruoctiem as his inner join  tre as t on his.id=t.id \n" +
            "            inner join lichtiem as l on t.idtre=l.tre_idtre \n" +
            "            inner join vacxin as v on l.vacxin_mavx=v.mavx\n" +
            "            where  l.ghichu=\"chua tiem\";", nativeQuery = true)
    List<ThongTinTreAdmin> test2();

}
