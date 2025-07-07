package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello, Spring MVC!");
        return "hello"; // hello.html 뷰를 반환합니다.
    }
    
    @GetMapping("/users")
    public String showUsers() {
        return "users"; // users.html 뷰를 반환합니다.
    }
}
