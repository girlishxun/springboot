package com.example.controller;

import com.example.model.Medication;
import com.example.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/medication")
public class MedicationController {

    private final MedicationService medicationService;

    @Autowired
    public MedicationController(MedicationService medicationService) {
        this.medicationService = medicationService;
    }

    @GetMapping("/list")
    public String listMedications(Model model) {
        model.addAttribute("medications", medicationService.getAllMedications());
        return "medication/viewMedication";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("medication", new Medication());
        return "medication/addMedication";
    }

    @PostMapping("/add")
    public String addMedication(@ModelAttribute("medication") Medication medication) {
        medicationService.addMedication(medication);
        return "redirect:/medication/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int medicationId, Model model) {
        Medication medication = medicationService.getMedicationById(medicationId);
        model.addAttribute("medication", medication);
        return "medication/editMedication";
    }

    @PostMapping("/edit/{id}")
    public String updateMedication(@PathVariable("id") int medicationId, @ModelAttribute("medication") Medication medication) {
        medication.setMedicationId(medicationId);
        medicationService.updateMedication(medication);
        return "redirect:/medication/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteMedication(@PathVariable("id") int medicationId) {
        medicationService.deleteMedication(medicationId);
        return "redirect:/medication/list";
    }
}
