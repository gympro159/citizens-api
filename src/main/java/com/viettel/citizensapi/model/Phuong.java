package com.viettel.citizensapi.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class Phuong {
    @Id
    public String idPhuong;
    public String tenPhuong;
    public ArrayList<SOSMember> sosMember;

    public Phuong() {
    }

    public Phuong(String idPhuong, String tenPhuong, ArrayList<SOSMember> sosMember) {
        this.idPhuong = idPhuong;
        this.tenPhuong = tenPhuong;
        this.sosMember = sosMember;
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

    public ArrayList<SOSMember> getSOSMember() {
        return sosMember;
    }

    public void setSOSMember(ArrayList<SOSMember> sosMember) {
        this.sosMember = sosMember;
    }

}