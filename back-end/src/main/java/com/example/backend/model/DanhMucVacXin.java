package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "danhmucvacxin")
public class DanhMucVacXin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maDM;

    private String tendm;
    private String mota;
    private int soluonghiencon;

    @OneToMany(mappedBy = "danhmucvacxin",cascade = CascadeType.ALL)
    private Set<VacXin> vacXinSet;

    public DanhMucVacXin(int maDM, String tendm, String mota, int soluonghiencon, Set<VacXin> vacXinSet) {
        this.maDM = maDM;
        this.tendm = tendm;
        this.mota = mota;
        this.soluonghiencon = soluonghiencon;
        this.vacXinSet = vacXinSet;
    }
}
