package cn.edu.zucc.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController

@RequestMapping("/error")

public class TestController implements ErrorController {
   
    public String getErrorPath() {
        return null;
    }

  
    @RequestMapping
    public Map<String, Object> handleError() {
        //用Map容器返回信息
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 404);
        map.put("msg", "404NotFound");
        return map;
    }

    @RequestMapping("/ok")
    @ResponseBody
    public Map<String, Object> noError() {
        //用Map容器返回信息
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code ", 200);
        map.put("msg", "正常运行");

        return map;
    }


}
