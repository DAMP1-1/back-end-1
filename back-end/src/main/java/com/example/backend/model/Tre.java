package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@NoArgsConstructor
@Entity
@Table(name = "tre")
public class Tre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtre;
    private String tentre;
    private Date ngaysinh;
    private float chieucao;
    private float cannang;
    private int gioitinh;
    private int somuidatiem;

    @OneToMany(mappedBy = "tre",cascade = CascadeType.ALL)
    private Set<LichSuTruocTiem> lichSuTruocTiemSet;

    @OneToMany(mappedBy = "tre",cascade = CascadeType.ALL)
    private Set<LichTiem> lichTiem;

    @ManyToOne
    @JoinColumn(name = "id")
    private User user;

    public Tre(int idtre, String tentre, Date ngaysinh, float chieucao, float cannang, int gioitinh, int somuidatiem, Set<LichSuTruocTiem> lichSuTruocTiemSet, Set<LichTiem> lichTiem, User users) {
        this.idtre = idtre;
        this.tentre = tentre;
        this.ngaysinh = ngaysinh;
        this.chieucao = chieucao;
        this.cannang = cannang;
        this.gioitinh = gioitinh;
        this.somuidatiem = somuidatiem;
        this.lichSuTruocTiemSet = lichSuTruocTiemSet;
        this.lichTiem = lichTiem;
        this.user = users;
    }

    public int getIdtre() {
        return idtre;
    }

    public void setIdtre(int idtre) {
        this.idtre = idtre;
    }

    public String getTentre() {
        return tentre;
    }

    public void setTentre(String tentre) {
        this.tentre = tentre;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public float getChieucao() {
        return chieucao;
    }

    public void setChieucao(float chieucao) {
        this.chieucao = chieucao;
    }

    public float getCannang() {
        return cannang;
    }

    public void setCannang(float cannang) {
        this.cannang = cannang;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getSomuidatiem() {
        return somuidatiem;
    }

    public void setSomuidatiem(int somuidatiem) {
        this.somuidatiem = somuidatiem;
    }

    public Set<LichSuTruocTiem> getLichSuTruocTiemSet() {
        return lichSuTruocTiemSet;
    }

    public void setLichSuTruocTiemSet(Set<LichSuTruocTiem> lichSuTruocTiemSet) {
        this.lichSuTruocTiemSet = lichSuTruocTiemSet;
    }

    public Set<LichTiem> getLichTiem() {
        return lichTiem;
    }

    public void setLichTiem(Set<LichTiem> lichTiem) {
        this.lichTiem = lichTiem;
    }

    public User getUsers() {
        return user;
    }

    public void setUsers(User users) {
        this.user = users;
    }
}
