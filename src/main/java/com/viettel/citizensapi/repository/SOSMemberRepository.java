package com.viettel.citizensapi.repository;

import com.viettel.citizensapi.model.SOSMember;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SOSMemberRepository extends MongoRepository<SOSMember, String>{
    
}