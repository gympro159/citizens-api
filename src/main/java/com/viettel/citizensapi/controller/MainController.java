package com.viettel.citizensapi.controller;

import java.util.List;

import com.viettel.citizensapi.model.Quan;
import com.viettel.citizensapi.model.WarningInfo;
import com.viettel.citizensapi.repository.QuanRepository;
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

    private QuanRepository quanRepository;
    private WarningInfoRepository warningInfoRepository;

    public MainController(QuanRepository quanRepository, WarningInfoRepository warningInfoRepository) {
        this.quanRepository = quanRepository;
        this.warningInfoRepository = warningInfoRepository;
    }

    //Quan
    @GetMapping("/quan")
    public List<Quan> getAllQuan() {
        return quanRepository.findAll();
    }

    @PostMapping("/quan")
    public void insertQuan(@RequestBody Quan quan){
        this.quanRepository.insert(quan);
    }

    @PutMapping("/quan")
    public void updateQuan(@RequestBody Quan quan){
        this.quanRepository.save(quan);
    }

    @DeleteMapping("/quan/{id}")
    public void deleteQuan(@PathVariable("id") String id){
        this.quanRepository.deleteById(id);
    }

    //WarningInfo
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