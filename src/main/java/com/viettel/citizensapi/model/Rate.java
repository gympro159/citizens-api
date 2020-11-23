package com.viettel.citizensapi.model;

import org.springframework.data.annotation.Id;

public class Rate {
    @Id
    public String idRate;
    public String nameRate;

    public Rate() {
    }

    public Rate(String idRate, String nameRate) {
        this.idRate = idRate;
        this.nameRate = nameRate;
    }

    public String getIdRate() {
        return idRate;
    }

    public void setIdRate(String idRate) {
        this.idRate = idRate;
    }

    public String getNameRate() {
        return nameRate;
    }

    public void setNameRate(String nameRate) {
        this.nameRate = nameRate;
    }

}