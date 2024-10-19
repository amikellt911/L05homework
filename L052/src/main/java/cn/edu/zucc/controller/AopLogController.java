package cn.edu.zucc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class AopLogController {
    @GetMapping("/aoptest")
    public String aVoid(){
        return "hello aop test";
    }
    @GetMapping("/new")
    public String aNew(){
        return "new GetMapping";
    }
}
