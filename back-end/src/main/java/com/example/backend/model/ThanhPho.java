package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "thanhpho")
public class ThanhPho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maTP;
    private String tenTP;

    @OneToMany(mappedBy = "thanhpho",cascade = CascadeType.ALL)
    private Set<QuanHuyen> quanhuyen;

    public ThanhPho(int maTP, String tenTP, Set<QuanHuyen> quanhuyen) {
        this.maTP = maTP;
        this.tenTP = tenTP;
        this.quanhuyen = quanhuyen;
    }

    public int getMaTP() {
        return maTP;
    }

    public void setMaTP(int maTP) {
        this.maTP = maTP;
    }

    public String getTenTP() {
        return tenTP;
    }

    public void setTenTP(String tenTP) {
        this.tenTP = tenTP;
    }

    public Set<QuanHuyen> getQuanhuyen() {
        return quanhuyen;
    }

    public void setQuanhuyen(Set<QuanHuyen> quanhuyen) {
        this.quanhuyen = quanhuyen;
    }
}
