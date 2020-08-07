package com.fjw.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FenzhiController {

    @GetMapping("/other")
    public String LoginPage() {



        return  "other";
    }
}
