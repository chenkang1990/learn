package cn.learn.springboot.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/getHello")
    public String get() {
        return "hello, world!";
    }

    // 2 ^ 64
    // 2 ^ 6 = 64
    public static void main(String[] args) {
//        long max = 1;
//        max = (max << 63) - 1;
//        System.out.println(max);
//        System.out.println(Long.MAX_VALUE);


        long min = 1;
        min = min << 63;
        System.out.println(min);
        System.out.println(Long.MIN_VALUE);
    }

}
