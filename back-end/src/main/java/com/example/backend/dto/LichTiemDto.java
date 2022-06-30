package com.example.backend.dto;

import java.util.Date;

public class LichTiemDto {
    private Date ngaytiem;
    private int idtre;
    private int mavx;

    public LichTiemDto() {
    }
    public LichTiemDto(Date ngaytiem, int idtre, int mavx) {
        this.ngaytiem = ngaytiem;
        this.idtre = idtre;
        this.mavx = mavx;
    }



    public Date getNgaytiem() {
        return ngaytiem;
    }

    public void setNgaytiem(Date ngaytiem) {
        this.ngaytiem = ngaytiem;
    }

    public int getIdtre() {
        return idtre;
    }

    public void setIdtre(int idtre) {
        this.idtre = idtre;
    }

    public int getMavx() {
        return mavx;
    }

    public void setMavx(int mavx) {
        this.mavx = mavx;
    }
}
