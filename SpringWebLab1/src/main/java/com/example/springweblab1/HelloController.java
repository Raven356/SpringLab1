package com.example.springweblab1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/")
    String helloWeb(){
        return "index.html";
    }

    @GetMapping("/Nadiia.html")
    String Nadiia(){return "Nadiia.html";}

    @GetMapping("/Vlad.html")
    String Vlad(){return "Vlad.html";}
    @GetMapping("/Vlada.html")
    String Vlada(){return "Vlada.html";}
    @GetMapping("/Olexander.html")
    String Olexander(){return "Olexander.html";}

    @GetMapping("/index.html")
    String Home(){
        return helloWeb();
    }

    @GetMapping("/css/styles.css")
    String Styles(){
        return "styles.css";
    }

    @GetMapping("/error")
    String error(){
        return "error.html";
    }
}
