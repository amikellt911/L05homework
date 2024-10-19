package cn.edu.zucc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class AopLogsfController {
    @GetMapping("/test2")
    public String aVoid(){
        return "hello aop test";
    }
    @GetMapping("/new")
    public String aNew(){
        return "new GetMapping";
    }
}
