package com.viettel.citizensapi.repository;

import com.viettel.citizensapi.model.Type;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TypeRepository extends MongoRepository<Type, String>{
    
}