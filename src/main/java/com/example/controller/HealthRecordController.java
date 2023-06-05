package com.example.controller;

import com.example.model.HealthRecord;
import com.example.service.HealthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/healthrecord")
public class HealthRecordController {

    private final HealthRecordService healthRecordService;

    @Autowired
    public HealthRecordController(HealthRecordService healthRecordService) {
        this.healthRecordService = healthRecordService;
    }

    @GetMapping("/list")
    public String listHealthRecords(Model model) {
        model.addAttribute("healthRecords", healthRecordService.getAllHealthRecords());
        return "healthrecord/viewHealthRecord";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("healthRecord", new HealthRecord());
        return "healthrecord/addHealthRecord";
    }

    @PostMapping("/add")
    public String addHealthRecord(@ModelAttribute("healthRecord") HealthRecord healthRecord) {
        healthRecordService.addHealthRecord(healthRecord);
        return "redirect:/healthrecord/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int healthRecordId, Model model) {
        HealthRecord healthRecord = healthRecordService.getHealthRecordById(healthRecordId);
        model.addAttribute("healthRecord", healthRecord);
        return "healthrecord/editHealthRecord";
    }

    @PostMapping("/edit/{id}")
    public String updateHealthRecord(@PathVariable("id") int healthRecordId, @ModelAttribute("healthRecord") HealthRecord healthRecord) {
        healthRecord.setRecordId(healthRecordId);
        healthRecordService.updateHealthRecord(healthRecord);
        return "redirect:/healthrecord/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteHealthRecord(@PathVariable("id") int healthRecordId) {
        healthRecordService.deleteHealthRecord(healthRecordId);
        return "redirect:/healthrecord/list";
    }
}
