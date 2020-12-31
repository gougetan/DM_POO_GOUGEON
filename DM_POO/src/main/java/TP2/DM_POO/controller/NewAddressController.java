package TP2.DM_POO.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewAddressController {

    @GetMapping("/adresse")
    public String newShowAddresses(Model model) {
        return "adresse";
    }
}