package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vacxin")
public class VacXin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maVX;
    private String tenvx;
    private String noisx;
    private String lieutrinh;
    private int somuitoida;
    private String tinhtrangsautiem;

    @OneToMany(mappedBy = "vacxin",cascade = CascadeType.ALL)
    private Set<LichTiem> lichTiemSet;

    @OneToMany(mappedBy = "vacxin",cascade = CascadeType.ALL)
    private Set<PhanDoTiemChung> phanDoTiemChungSet;

    @ManyToOne
    @JoinColumn(name = "maDM")
    private DanhMucVacXin danhmucvacxin;

    @ManyToOne
    @JoinColumn(name = "maPN")
    private PhieuNhap phieunhap;

    public VacXin(int maVX, String tenvx, String noisx, String lieutrinh, int somuitoida, String tinhtrangsautiem, Set<LichTiem> lichTiemSet, Set<PhanDoTiemChung> phanDoTiemChungSet, DanhMucVacXin danhMucVacXin, PhieuNhap phieuNhap) {
        this.maVX = maVX;
        this.tenvx = tenvx;
        this.noisx = noisx;
        this.lieutrinh = lieutrinh;
        this.somuitoida = somuitoida;
        this.tinhtrangsautiem = tinhtrangsautiem;
        this.lichTiemSet = lichTiemSet;
        this.phanDoTiemChungSet = phanDoTiemChungSet;
        this.danhmucvacxin = danhMucVacXin;
        this.phieunhap = phieuNhap;
    }

    public int getMaVX() {
        return maVX;
    }

    public void setMaVX(int maVX) {
        this.maVX = maVX;
    }

    public String getTenvx() {
        return tenvx;
    }

    public void setTenvx(String tenvx) {
        this.tenvx = tenvx;
    }

    public String getNoisx() {
        return noisx;
    }

    public void setNoisx(String noisx) {
        this.noisx = noisx;
    }

    public String getLieutrinh() {
        return lieutrinh;
    }

    public void setLieutrinh(String lieutrinh) {
        this.lieutrinh = lieutrinh;
    }

    public int getSomuitoida() {
        return somuitoida;
    }

    public void setSomuitoida(int somuitoida) {
        this.somuitoida = somuitoida;
    }

    public String getTinhtrangsautiem() {
        return tinhtrangsautiem;
    }

    public void setTinhtrangsautiem(String tinhtrangsautiem) {
        this.tinhtrangsautiem = tinhtrangsautiem;
    }

    public Set<LichTiem> getLichTiemSet() {
        return lichTiemSet;
    }

    public void setLichTiemSet(Set<LichTiem> lichTiemSet) {
        this.lichTiemSet = lichTiemSet;
    }

    public Set<PhanDoTiemChung> getPhanDoTiemChungSet() {
        return phanDoTiemChungSet;
    }

    public void setPhanDoTiemChungSet(Set<PhanDoTiemChung> phanDoTiemChungSet) {
        this.phanDoTiemChungSet = phanDoTiemChungSet;
    }

    public DanhMucVacXin getDanhmucvacxin() {
        return danhmucvacxin;
    }

    public void setDanhmucvacxin(DanhMucVacXin danhmucvacxin) {
        this.danhmucvacxin = danhmucvacxin;
    }

    public PhieuNhap getPhieunhap() {
        return phieunhap;
    }

    public void setPhieunhap(PhieuNhap phieunhap) {
        this.phieunhap = phieunhap;
    }
}
