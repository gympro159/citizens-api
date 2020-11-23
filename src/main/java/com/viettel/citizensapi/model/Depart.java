package com.viettel.citizensapi.model;

import org.springframework.data.annotation.Id;

public class Depart {
    @Id
    public String idDepart;
    public String nameDepart;

    public Depart() {
    }

    public Depart(String idDepart, String nameDepart) {
        this.idDepart = idDepart;
        this.nameDepart = nameDepart;
    }

    public String getIdDepart() {
        return idDepart;
    }

    public void setIdDepart(String idDepart) {
        this.idDepart = idDepart;
    }

    public String getNameDepart() {
        return nameDepart;
    }

    public void setNameDepart(String nameDepart) {
        this.nameDepart = nameDepart;
    }

}