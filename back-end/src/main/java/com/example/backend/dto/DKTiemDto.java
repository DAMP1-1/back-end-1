package com.example.backend.dto;

import java.util.Date;

public class DKTiemDto {
    private  int idtre;
    private String tentre;
    private Date ngaytiem;
    private String tenvx;
    private int somui;
    private int somuitoida;

    public int getIdtre() {
        return idtre;
    }

    public String getTentre() {
        return tentre;
    }

    public Date getNgaytiem() {
        return ngaytiem;
    }

    public String getTenvx() {
        return tenvx;
    }

    public int getSomui() {
        return somui;
    }

    public int getSomuitoida() {
        return somuitoida;
    }
}
