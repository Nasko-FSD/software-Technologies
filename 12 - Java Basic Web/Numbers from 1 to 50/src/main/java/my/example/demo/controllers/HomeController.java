package my.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/numbers")
    public String displayNumbers() {
        return "numbers";
    }

}
