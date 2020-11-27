package com.viettel.citizensapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "WarningInfo")
public class WarningInfo {
    @Id
    public String idWarningInfo;
    public String title;
    public String time;
    public String content;
    public String attach;
    public Boolean seen;
    public Type type;
    public Rate rate;
    public Depart depart;

    public WarningInfo() {
    }

    public WarningInfo(String idWarningInfo, String title, String time, String content, String attach, Boolean seen,
            Type type, Rate rate, Depart depart) {
        this.idWarningInfo = idWarningInfo;
        this.title = title;
        this.time = time;
        this.content = content;
        this.attach = attach;
        this.seen = seen;
        this.type = type;
        this.rate = rate;
        this.depart = depart;
    }

    public String getIdWarningInfo() {
        return idWarningInfo;
    }

    public void setIdWarningInfo(String idWarningInfo) {
        this.idWarningInfo = idWarningInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public Boolean getSeen() {
        return seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public Depart getDepart() {
        return depart;
    }

    public void setDepart(Depart depart) {
        this.depart = depart;
    }

}