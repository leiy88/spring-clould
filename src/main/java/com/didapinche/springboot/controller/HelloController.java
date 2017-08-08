package com.didapinche.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leiyang on 17-8-3.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/{name}")
    String home2(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}
