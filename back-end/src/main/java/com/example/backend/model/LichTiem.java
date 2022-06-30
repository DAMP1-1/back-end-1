package com.example.backend.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lichtiem")
public class LichTiem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maLT;
    private Date ngaytiem;
    private String ghichu;
    private int muitiem;

    @ManyToOne
    @JoinColumn(name="tre_idtre")
    private Tre tre;

    @ManyToOne
    @JoinColumn(name="vacxin_maVX")
    private VacXin vacxin;

    public LichTiem(int maLT, Date ngaytiem, String ghichu, int muitiem, Tre tre, VacXin vacxin) {
        this.maLT = maLT;
        this.ngaytiem = ngaytiem;
        this.ghichu = ghichu;
        this.muitiem = muitiem;
        this.tre = tre;
        this.vacxin = vacxin;
    }

    public LichTiem() {
    }

    public int getMaLT() {
        return maLT;
    }

    public void setMaLT(int maLT) {
        this.maLT = maLT;
    }

    public Date getNgaytiem() {
        return ngaytiem;
    }

    public void setNgaytiem(Date ngaytiem) {
        this.ngaytiem = ngaytiem;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public int getMuitiem() {
        return muitiem;
    }

    public void setMuitiem(int muitiem) {
        this.muitiem = muitiem;
    }

    public Tre getTre() {
        return tre;
    }

    public void setTre(Tre tre) {
        this.tre = tre;
    }

    public VacXin getVacxin() {
        return vacxin;
    }

    public void setVacxin(VacXin vacxin) {
        this.vacxin = vacxin;
    }
}
