package br.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model m) {
        System.out.println("asdsadsdsdsadasdsadsa");
        m.addAttribute("someAttribute", "someValue");
        return "index";
    }

}
