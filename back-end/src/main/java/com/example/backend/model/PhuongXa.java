package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "phuongxa")
public class PhuongXa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maPX;

    private String tenPX;

    @ManyToOne
    @JoinColumn(name="quanhuyen_maQH")
    private QuanHuyen quanhuyen;

    @OneToMany(mappedBy = "phuongxa",cascade = CascadeType.ALL)
    private Set<User> userSet;

    @OneToMany(mappedBy = "phuongxa",cascade = CascadeType.ALL)
    private Set<LichSuTruocTiem> lichSuTruocTiems;

    public PhuongXa(int maPX, String tenPX, QuanHuyen quanhuyen, Set<User> users, Set<LichSuTruocTiem> lichSuTruocTiems) {
        this.maPX = maPX;
        this.tenPX = tenPX;
        this.quanhuyen = quanhuyen;
        this.userSet = users;
        this.lichSuTruocTiems = lichSuTruocTiems;
    }

    public int getMaPX() {
        return maPX;
    }

    public void setMaPX(int maPX) {
        this.maPX = maPX;
    }

    public String getTenPX() {
        return tenPX;
    }

    public void setTenPX(String tenPX) {
        this.tenPX = tenPX;
    }

    public QuanHuyen getQuanhuyen() {
        return quanhuyen;
    }

    public void setQuanhuyen(QuanHuyen quanhuyen) {
        this.quanhuyen = quanhuyen;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    public Set<LichSuTruocTiem> getLichSuTruocTiems() {
        return lichSuTruocTiems;
    }

    public void setLichSuTruocTiems(Set<LichSuTruocTiem> lichSuTruocTiems) {
        this.lichSuTruocTiems = lichSuTruocTiems;
    }
}
