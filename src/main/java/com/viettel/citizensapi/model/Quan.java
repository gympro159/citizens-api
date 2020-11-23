package com.viettel.citizensapi.model;

import org.springframework.data.annotation.Id;

public class Quan {
    @Id
    public String idQuan;
    public String tenQuan;

    public Quan() {
    }

    public Quan(String idQuan, String tenQuan) {
        this.idQuan = idQuan;
        this.tenQuan = tenQuan;
    }

    public String getIdQuan() {
        return idQuan;
    }

    public void setIdQuan(String idQuan) {
        this.idQuan = idQuan;
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }
    
}