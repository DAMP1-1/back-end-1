package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "phieunhap")
public class PhieuNhap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maPN;
    private Date ngaynhaphang;

    @OneToMany(mappedBy = "phieunhap",cascade = CascadeType.ALL)
    private Set<VacXin> vacXinSet;

    @ManyToOne
    @JoinColumn(name = "idNCC")
    private NhaCungCap nhacungcap;

    public PhieuNhap(int maPN, Date ngaynhaphang, Set<VacXin> vacXinSet, NhaCungCap nhaCungCap) {
        this.maPN = maPN;
        this.ngaynhaphang = ngaynhaphang;
        this.vacXinSet = vacXinSet;
        this.nhacungcap = nhaCungCap;
    }

    public int getMaPN() {
        return maPN;
    }

    public void setMaPN(int maPN) {
        this.maPN = maPN;
    }

    public Date getNgaynhaphang() {
        return ngaynhaphang;
    }

    public void setNgaynhaphang(Date ngaynhaphang) {
        this.ngaynhaphang = ngaynhaphang;
    }

    public Set<VacXin> getVacXinSet() {
        return vacXinSet;
    }

    public void setVacXinSet(Set<VacXin> vacXinSet) {
        this.vacXinSet = vacXinSet;
    }

    public NhaCungCap getNhacungcap() {
        return nhacungcap;
    }

    public void setNhacungcap(NhaCungCap nhacungcap) {
        this.nhacungcap = nhacungcap;
    }
}
