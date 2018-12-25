package com.codegym.controller;

import com.codegym.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("myCount")
public class CounterController {

    @ModelAttribute("myCount")
    public MyCounter setUpCounter(){
        return new MyCounter();
    }

    @GetMapping("count")
    public String showCount (@ModelAttribute("myCount") MyCounter counter){
        counter.increment();
        return "count";
    }
}
