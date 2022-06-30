package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@Table(name = "nhacungcap")
public class NhaCungCap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNCC;
    private String tenncc;
    private String diachiNCC;
    private String sdt;
    private String nhanvienlienhe;

    @OneToMany(mappedBy = "nhacungcap",cascade = CascadeType.ALL)
    private Set<PhieuNhap> phieuNhapSet;

    public NhaCungCap(int idNCC, String tenncc, String diachiNCC, String sdt, String nhanvienlienhe, Set<PhieuNhap> phieuNhapSet) {
        this.idNCC = idNCC;
        this.tenncc = tenncc;
        this.diachiNCC = diachiNCC;
        this.sdt = sdt;
        this.nhanvienlienhe = nhanvienlienhe;
        this.phieuNhapSet = phieuNhapSet;
    }

    public int getIdNCC() {
        return idNCC;
    }

    public void setIdNCC(int idNCC) {
        this.idNCC = idNCC;
    }

    public String getTenncc() {
        return tenncc;
    }

    public void setTenncc(String tenncc) {
        this.tenncc = tenncc;
    }

    public String getDiachiNCC() {
        return diachiNCC;
    }

    public void setDiachiNCC(String diachiNCC) {
        this.diachiNCC = diachiNCC;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNhanvienlienhe() {
        return nhanvienlienhe;
    }

    public void setNhanvienlienhe(String nhanvienlienhe) {
        this.nhanvienlienhe = nhanvienlienhe;
    }

    public Set<PhieuNhap> getPhieuNhapSet() {
        return phieuNhapSet;
    }

    public void setPhieuNhapSet(Set<PhieuNhap> phieuNhapSet) {
        this.phieuNhapSet = phieuNhapSet;
    }
}
