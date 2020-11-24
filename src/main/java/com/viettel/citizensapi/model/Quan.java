package com.viettel.citizensapi.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Quan")
public class Quan {
    @Id
    public String idQuan;
    public String tenQuan;
    public ArrayList<Phuong> phuong;

    public Quan() {
    }

    public Quan(String idQuan, String tenQuan, ArrayList<Phuong> phuong) {
        this.idQuan = idQuan;
        this.tenQuan = tenQuan;
        this.phuong = phuong;
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
    
    public ArrayList<Phuong> getPhuong() {
        return phuong;
    }

    public void setPhuong(ArrayList<Phuong> phuong) {
        this.phuong = phuong;
    }
}