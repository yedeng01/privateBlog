package com.fjw.web;

import com.fjw.service.TagService;
import com.fjw.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AboutController {

    @Autowired
private TagService tagService;

    @Autowired
    private TypeService typeService;


@GetMapping("/about")
    public  String about(Model model){
  model.addAttribute("tags",tagService.listTag());
    model.addAttribute("types",typeService.listType());
    return "about";
    }

}
