package com.viettel.citizensapi.controller;

import java.util.List;

import com.viettel.citizensapi.model.SOSMember;
import com.viettel.citizensapi.model.WarningInfo;
import com.viettel.citizensapi.repository.SOSMemberRepository;
import com.viettel.citizensapi.repository.WarningInfoRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= "*", allowedHeaders = "*")
@RestController
@RequestMapping("/")
public class MainController {

    private SOSMemberRepository sosMemberRepository;
    private WarningInfoRepository warningInfoRepository;

    public MainController(SOSMemberRepository sosMemberRepository, WarningInfoRepository warningInfoRepository) {
        this.sosMemberRepository = sosMemberRepository;
        this.warningInfoRepository = warningInfoRepository;
    }

    //SOSMember
    @GetMapping("/sosmembers")
    public List<SOSMember> getAllSOSMembers() {
        return sosMemberRepository.findAll();
    }

    @PostMapping("/sosmember")
    public void insertSOSMember(@RequestBody SOSMember sosMember){
        this.sosMemberRepository.insert(sosMember);
    }

    @PutMapping("/sosmember")
    public void updateSOSMember(@RequestBody SOSMember sosMember){
        this.sosMemberRepository.save(sosMember);
    }

    @DeleteMapping("/sosmember/{id}")
    public void deleteSOSMember(@PathVariable("id") String id){
        this.sosMemberRepository.deleteById(id);
    }

    //WarningInfo
    //SOSMember
    @GetMapping("/warninginfo")
    public List<WarningInfo> getAllWarningInfo() {
        return warningInfoRepository.findAll();
    }

    // @GetMapping("/warninginfo/{id}")
    // public WarningInfo getWarningInfo(@PathVariable("id") String id) {
    //     return warningInfoRepository.findOneById(id);
    // }

    @PostMapping("/warninginfo")
    public void insertWarningInfo(@RequestBody WarningInfo warningInfo){
        this.warningInfoRepository.insert(warningInfo);
    }

    @PutMapping("/warninginfo")
    public void updateWarningInfo(@RequestBody WarningInfo warningInfo){
        this.warningInfoRepository.save(warningInfo);
    }

    @DeleteMapping("/warninginfo/{id}")
    public void deleteWarningInfo(@PathVariable("id") String id){
        this.warningInfoRepository.deleteById(id);
    }
}