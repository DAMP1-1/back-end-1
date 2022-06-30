package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "phandotiemchung")
public class PhanDoTiemChung {
    @Id
    private int idPD;
    private int dotuoi;

    @ManyToOne
    @JoinColumn(name = "vacxin_maVX")
    private VacXin vacxin;

    public PhanDoTiemChung(int idPD, int dotuoi, VacXin vacXin) {
        this.idPD = idPD;
        this.dotuoi = dotuoi;
        this.vacxin = vacXin;
    }

    public int getIdPD() {
        return idPD;
    }

    public void setIdPD(int idPD) {
        this.idPD = idPD;
    }

    public int getDotuoi() {
        return dotuoi;
    }

    public void setDotuoi(int dotuoi) {
        this.dotuoi = dotuoi;
    }

    public VacXin getVacxin() {
        return vacxin;
    }

    public void setVacxin(VacXin vacxin) {
        this.vacxin = vacxin;
    }
}
