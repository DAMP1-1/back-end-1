package com.example.backend.dto;

import javax.persistence.Column;
import javax.validation.constraints.*;
import java.util.Date;

public class UserDto {
    @NotEmpty(message = "Email không được để trống")
    @Pattern(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$", message = "Email không đúng định dạng")
    @Column(unique = true)
    private String email;
    @NotEmpty(message = "Mật khẩu không được để trống")
    private String password;
    @NotEmpty(message = "Xác nhận mật khẩu không được để trống")
    private String matchingPassword;
    @NotEmpty(message = "Họ tên không được để trống")
    private String hoten;
    private Date ngaysinh;
    @Max(value = 2)
    @Min(0)
    private int gioitinh;
    @NotEmpty(message = "CMNN/ CCCD không được để trống")
    private String cmnd;
    @NotEmpty(message = "Quốc tịch không được để trống")
    private String quoctich;
    @NotEmpty(message = "Họ tên không được để trống")
    private String dantoc;
    @NotEmpty(message = "Tỉnh/thành phố không được để trống")
    private String tinh;
    @NotEmpty(message = "Quận/Huyện không được để trống")
    private String huyen;
    @NotEmpty(message = "Phường/xã không được để trống")
    private String xa;
    @NotEmpty(message = "Địa chỉ không được để trống")
    private String diachi;
    @NotEmpty(message = "SĐT không được để trống")
    private String sdt;

    public UserDto() {
    }

//    public UserDto(@NotNull @NotEmpty String email, @NotNull @NotEmpty(message = "Mật khẩu không được để trống") String password, @NotNull @NotEmpty(message = "Xác nhận mật khẩu không được để trống") String matchingPassword) {
//        this.email = email;
//        this.password = password;
//        this.matchingPassword = matchingPassword;
//    }

    public UserDto(@NotNull @NotEmpty String email, @NotNull @NotEmpty(message = "Mật khẩu không được để trống") String password, @NotNull @NotEmpty(message = "Xác nhận mật khẩu không được để trống") String matchingPassword, @Max(2)
    @Min(0) int gioitinh, @NotEmpty(message = "CMNN/ CCCD không được để trống")
            String cmnd,
                   @NotEmpty(message = "Quốc tịch không được để trống")
                           String quoctich,
                   @NotEmpty(message = "Họ tên không được để trống")
                           String dantoc,
                   @NotEmpty(message = "Tỉnh/thành phố không được để trống")
                           String tinh,
                   @NotEmpty(message = "Quận/Huyện không được để trống")
                           String huyen,
                   @NotEmpty(message = "Phường/xã không được để trống")
                           String xa,
                   @NotEmpty(message = "Địa chỉ không được để trống")
                           String diachi,
                   @NotEmpty(message = "SĐT không được để trống")
                           String sdt) {
        this.email = email;
        this.password = password;
        this.matchingPassword = matchingPassword;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.cmnd = cmnd;
        this.quoctich = quoctich;
        this.dantoc = dantoc;
        this.tinh = tinh;
        this.huyen = huyen;
        this.xa = xa;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public String getDantoc() {
        return dantoc;
    }

    public void setDantoc(String dantoc) {
        this.dantoc = dantoc;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }
}
