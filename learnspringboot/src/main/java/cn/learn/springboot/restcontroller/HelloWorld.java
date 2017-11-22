package cn.learn.springboot.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/getHello")
    public String get() {
        return "hello, world!";
    }

}
