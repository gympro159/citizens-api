package com.viettel.citizensapi.repository;

import com.viettel.citizensapi.model.WarningInfo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WarningInfoRepository extends MongoRepository<WarningInfo, String>{
    //WarningInfo findOneById(String id);
}