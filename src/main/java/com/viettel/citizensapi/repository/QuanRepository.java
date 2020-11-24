package com.viettel.citizensapi.repository;

import com.viettel.citizensapi.model.Quan;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuanRepository extends MongoRepository<Quan, String>{
    
}