package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GestorePagine 
{
    @GetMapping("/altra")
    public String getMethodName() 
    {
        return "altrapagina";
    }
    
}
