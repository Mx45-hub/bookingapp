package com.booking.bookingapp2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class mycontroller {

    @GetMapping("/")
    public String getMethodName() {
        return "home";
    }
    
    
}
