package com.viettel.citizensapi.model;

import org.springframework.data.annotation.Id;

public class SOSMember {
    @Id
    public String idSOSMember;
    public String nameSOSMember;
    public String phoneSOSMember;

    public SOSMember() {
    }

    public SOSMember(String idSOSMember, String nameSOSMember, String phoneSOSMember) {
        this.idSOSMember = idSOSMember;
        this.nameSOSMember = nameSOSMember;
        this.phoneSOSMember = phoneSOSMember;
    }

    public String getIdSOSMember() {
        return idSOSMember;
    }

    public void setIdSOSMember(String idSOSMember) {
        this.idSOSMember = idSOSMember;
    }

    public String getNameSOSMember() {
        return nameSOSMember;
    }

    public void setNameSOSMember(String nameSOSMember) {
        this.nameSOSMember = nameSOSMember;
    }

    public String getPhoneSOSMember() {
        return phoneSOSMember;
    }

    public void setPhoneSOSMember(String phoneSOSMember) {
        this.phoneSOSMember = phoneSOSMember;
    }

}