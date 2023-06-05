package com.example.controller;

import com.example.model.PrivateDoctor;
import com.example.service.PrivateDoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/privatedoctors")
public class PrivateDoctorController {
    private final PrivateDoctorService privateDoctorService;

    public PrivateDoctorController(PrivateDoctorService privateDoctorService) {
        this.privateDoctorService = privateDoctorService;
    }

    @GetMapping
    public String getAllPrivateDoctors(Model model) {
        List<PrivateDoctor> privateDoctors = privateDoctorService.getAllPrivateDoctors();
        model.addAttribute("privateDoctors", privateDoctors);
        return "privateDoctor/viewPrivateDoctor";
    }

    @GetMapping("/{doctorId}")
    public String getPrivateDoctorById(@PathVariable("doctorId") int doctorId, Model model) {
        PrivateDoctor privateDoctor = privateDoctorService.getPrivateDoctorById(doctorId);
        model.addAttribute("privateDoctor", privateDoctor);
        return "privateDoctor/viewPrivateDoctor";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("privateDoctor", new PrivateDoctor());
        return "privateDoctor/addPrivateDoctor";
    }

    @PostMapping("/add")
    public String addPrivateDoctor(@ModelAttribute("privateDoctor") PrivateDoctor privateDoctor) {
        privateDoctorService.addPrivateDoctor(privateDoctor);
        return "redirect:/privatedoctors";
    }

    @GetMapping("/{doctorId}/edit")
    public String showEditForm(@PathVariable("doctorId") int doctorId, Model model) {
        PrivateDoctor privateDoctor = privateDoctorService.getPrivateDoctorById(doctorId);
        model.addAttribute("privateDoctor", privateDoctor);
        return "privateDoctor/editPrivateDoctor";
    }

    @PostMapping("/{doctorId}/edit")
    public String updatePrivateDoctor(@ModelAttribute("privateDoctor") PrivateDoctor privateDoctor) {
        privateDoctorService.updatePrivateDoctor(privateDoctor);
        return "redirect:/privatedoctors";
    }

    @GetMapping("/{doctorId}/delete")
    public String deletePrivateDoctor(@PathVariable("doctorId") int doctorId) {
        privateDoctorService.deletePrivateDoctor(doctorId);
        return "redirect:/privatedoctors";
    }
}
