package com.coherentsolutions.spring.school.springbootbeanscopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    @Qualifier("requestBean")
    private MyClass requestBean;

    @Autowired
    @Qualifier("sessionBean")
    private MyClass sessionBean;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("requestBean", requestBean);
        model.addAttribute("sessionBean", sessionBean);
        return "home";
    }
}
