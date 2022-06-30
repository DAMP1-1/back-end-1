package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "quanhuyen")
public class QuanHuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maQH;

    private String tenQH;

    @ManyToOne
    @JoinColumn(name = "maTP")
    private ThanhPho thanhpho;

    @OneToMany(mappedBy = "quanhuyen")
    private Set<PhuongXa> phuongxa;

    public QuanHuyen(int maQH, String tenQH, ThanhPho thanhPho, Set<PhuongXa> phuongxa) {
        this.maQH = maQH;
        this.tenQH = tenQH;
        this.thanhpho = thanhPho;
        this.phuongxa = phuongxa;
    }

    public int getMaQH() {
        return maQH;
    }

    public void setMaQH(int maQH) {
        this.maQH = maQH;
    }

    public String getTenQH() {
        return tenQH;
    }

    public void setTenQH(String tenQH) {
        this.tenQH = tenQH;
    }

    public ThanhPho getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(ThanhPho thanhpho) {
        this.thanhpho = thanhpho;
    }

    public Set<PhuongXa> getPhuongxa() {
        return phuongxa;
    }

    public void setPhuongxa(Set<PhuongXa> phuongxa) {
        this.phuongxa = phuongxa;
    }
}
