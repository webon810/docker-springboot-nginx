package com.sboot.docker01.comsbootdocker01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    
    @GetMapping("/")
    public String indexhello() {
        return "index";
    }
    
}
