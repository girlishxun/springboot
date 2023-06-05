package com.example.controller;

import com.example.model.FamilyMember;
import com.example.service.FamilyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/familyMember")
public class FamilyMemberController {

    private final FamilyMemberService familyMemberService;

    @Autowired
    public FamilyMemberController(FamilyMemberService familyMemberService) {
        this.familyMemberService = familyMemberService;
    }

    @GetMapping("/view")
    public String viewFamilyMember(@RequestParam("memberId") int memberId, Model model) {
        FamilyMember familyMember = familyMemberService.getFamilyMemberById(memberId);
        model.addAttribute("familyMember", familyMember);
        return "familyMember/viewFamilyMember";
    }

    @GetMapping("/edit")
    public String editFamilyMember(@RequestParam("memberId") int memberId, Model model) {
        FamilyMember familyMember = familyMemberService.getFamilyMemberById(memberId);
        model.addAttribute("familyMember", familyMember);
        return "familyMember/editFamilyMember";
    }

    @PostMapping("/update")
    public String updateFamilyMember(@ModelAttribute FamilyMember familyMember) {
        familyMemberService.updateFamilyMember(familyMember);
        return "redirect:/familyMember/view?memberId=" + familyMember.getMemberId();
    }

    @GetMapping("/add")
    public String addFamilyMember(Model model) {
        FamilyMember familyMember = new FamilyMember();
        model.addAttribute("familyMember", familyMember);
        return "familyMember/addFamilyMember";
    }

    @PostMapping("/save")
    public String saveFamilyMember(@ModelAttribute FamilyMember familyMember) {
        familyMemberService.addFamilyMember(familyMember);
        return "redirect:/familyMember/view?memberId=" + familyMember.getMemberId();
    }
}
