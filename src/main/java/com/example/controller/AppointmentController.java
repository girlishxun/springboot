package com.example.controller;

import com.example.model.Appointment;
import com.example.service.AppointmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping("/list")
    public String listAppointments(Model model) {
        model.addAttribute("appointments", appointmentService.getAllAppointments());
        return "appointment/viewAppointment";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("appointment", new Appointment());
        return "appointment/addAppointment";
    }

    @PostMapping("/add")
    public String addAppointment(@ModelAttribute("appointment") Appointment appointment) {
        appointmentService.addAppointment(appointment);
        return "redirect:/appointment/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int appointmentId, Model model) {
        Appointment appointment = appointmentService.getAppointmentById(appointmentId);
        model.addAttribute("appointment", appointment);
        return "appointment/editAppointment";
    }

    @PostMapping("/edit/{id}")
    public String updateAppointment(@PathVariable("id") int appointmentId, @ModelAttribute("appointment") Appointment appointment) {
        appointment.setAppointmentId(appointmentId);
        appointmentService.updateAppointment(appointment);
        return "redirect:/appointment/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteAppointment(@PathVariable("id") int appointmentId) {
        appointmentService.deleteAppointment(appointmentId);
        return "redirect:/appointment/list";
    }
}
