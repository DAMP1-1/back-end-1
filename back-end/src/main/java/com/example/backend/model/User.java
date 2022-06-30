package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "userId")
    private Integer id;

    private String quoctich;
    private int gioitinh;
    private String cmnd;
    private String tenkhachhang;
    private String dantoc;
    private String email;
    private Date ngaysinh;
    private String address;
    private String matkhau;
    private String sdt;

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;


    @ManyToOne
    @JoinColumn(name = "phuongxa_maPX")
    private PhuongXa phuongxa;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private Set<Tre> treSet;


    public User(Integer id, String quoctich, int gioitinh, String cmnd, String tenkhachhang, String dantoc, String email, Date ngaysinh, String address, String matkhau, String sdt, Set<Role> roles, PhuongXa phuongxa, Set<Tre> treSet) {
        this.id = id;
        this.quoctich = quoctich;
        this.gioitinh = gioitinh;
        this.cmnd = cmnd;
        this.tenkhachhang = tenkhachhang;
        this.dantoc = dantoc;
        this.email = email;
        this.ngaysinh = ngaysinh;
        this.address = address;
        this.matkhau = matkhau;
        this.sdt = sdt;
        this.roles = roles;
        this.phuongxa = phuongxa;
        this.treSet = treSet;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getDantoc() {
        return dantoc;
    }

    public void setDantoc(String dantoc) {
        this.dantoc = dantoc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public PhuongXa getPhuongxa() {
        return phuongxa;
    }

    public void setPhuongxa(PhuongXa phuongxa) {
        this.phuongxa = phuongxa;
    }

    public Set<Tre> getTreSet() {
        return treSet;
    }

    public void setTreSet(Set<Tre> treSet) {
        this.treSet = treSet;
    }
}
