package com.viettel.citizensapi.model;

import org.springframework.data.annotation.Id;

public class Phuong {
    @Id
    public String idPhuong;
    public String tenPhuong;
    public Quan quan;

    public Phuong() {
    }

    public Phuong(String idPhuong, String tenPhuong, Quan quan) {
        this.idPhuong = idPhuong;
        this.tenPhuong = tenPhuong;
        this.quan = quan;
    }

    public String getIdPhuong() {
        return idPhuong;
    }

    public void setIdPhuong(String idPhuong) {
        this.idPhuong = idPhuong;
    }

    public String getTenPhuong() {
        return tenPhuong;
    }

    public void setTenPhuong(String tenPhuong) {
        this.tenPhuong = tenPhuong;
    }

    public Quan getQuan() {
        return quan;
    }

    public void setQuan(Quan quan) {
        this.quan = quan;
    }

}