package com.example.backend.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class TreDto {
    @NotEmpty(message = "Tên không được để trống")
    private String ten;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaysinh;
    private int gioitinh;
    @Min(value = 0,message = "chiều cao phải lớn hơn 0")
    private float chieucao;
    @Min(value = 0,message = "cân nặng phải lớn hơn 0")
    private float cannang;
    @Min(value = 0,message = "số mũi tiêm phải lớn hơn hoặc bằng 0")
    private int somuidatiem;


    public TreDto() {
    }


    public TreDto(@NotEmpty(message = "Tên không được để trống") String ten,  @DateTimeFormat(pattern = "yyyy-MM-dd") Date ngaysinh,int gioitinh, @Min(value = 0,message = "chiều cao phải lớn hơn 0") float chieucao,@Min(value = 0,message = "cân nặng phải lớn hơn 0") float cannang,@Min(value = 0,message = "số mũi tiêm phải lớn hơn hoặc bằng 0") int somuidatiem) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.chieucao = chieucao;
        this.cannang = cannang;
        this.somuidatiem = somuidatiem;
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

    public int getSomuidatiem() {
        return somuidatiem;
    }

    public void setSomuidatiem(int somuidatiem) {
        this.somuidatiem = somuidatiem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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
}
