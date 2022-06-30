package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name="lichsutruoctiem")
public class LichSuTruocTiem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int somui;
    private Date ngaytiemphong;

    @ManyToOne
    @JoinColumn(name ="phuongxa_maPX")
    private PhuongXa phuongxa;

    @ManyToOne
    @JoinColumn(name ="tre_idtre")
    private Tre tre;

    public LichSuTruocTiem(int id, int somui, Date ngaytiemphong, PhuongXa phuongXa, Tre tre) {
        this.id = id;
        this.somui = somui;
        this.ngaytiemphong = ngaytiemphong;
        this.phuongxa = phuongXa;
        this.tre = tre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSomui() {
        return somui;
    }

    public void setSomui(int somui) {
        this.somui = somui;
    }

    public Date getNgaytiemphong() {
        return ngaytiemphong;
    }

    public void setNgaytiemphong(Date ngaytiemphong) {
        this.ngaytiemphong = ngaytiemphong;
    }

    public PhuongXa getPhuongxa() {
        return phuongxa;
    }

    public void setPhuongxa(PhuongXa phuongxa) {
        this.phuongxa = phuongxa;
    }

    public Tre getTre() {
        return tre;
    }

    public void setTre(Tre tre) {
        this.tre = tre;
    }
}
