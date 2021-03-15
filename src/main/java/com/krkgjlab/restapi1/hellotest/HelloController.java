package com.krkgjlab.restapi1.hellotest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    }    
    
    // @GetMapping("/hello")
    // @ResponseBody
    // public String hello() {
    //     return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    // }    
    
    // @GetMapping("/hello")
    // @ResponseBody
    // public String hello() {
    //     return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    // }    
    
    // @GetMapping("/hello")
    // @ResponseBody
    // public String hello() {
    //     return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    // }    
    
    // @GetMapping("/hello")
    // @ResponseBody
    // public String hello() {
    //     return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    // }    
    
    // @GetMapping("/hello")
    // @ResponseBody
    // public String hello() {
    //     return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    // }
}
