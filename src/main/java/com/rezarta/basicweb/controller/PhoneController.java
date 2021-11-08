package com.rezarta.basicweb.controller;

import com.rezarta.basicweb.model.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhoneController {

    @GetMapping("new-phone")
    public String addTelefon(Model model){
        Phone phone = new Phone();
        model.addAttribute("phone", phone);
        return "newPhone";
    }

}
