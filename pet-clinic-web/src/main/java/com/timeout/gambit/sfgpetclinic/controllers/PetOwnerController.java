package com.timeout.gambit.sfgpetclinic.controllers;

import com.timeout.gambit.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/owner"})
public class PetOwnerController {
    private final OwnerService ownerService;

    public PetOwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "/owners/index";
    }
}
