package com.viettel.citizensapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "Type")
public class Type {
    @Id
    public String idType;
    public String nameType;

    public Type() {
    }

    public Type(String idType, String nameType) {
        this.idType = idType;
        this.nameType = nameType;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

}