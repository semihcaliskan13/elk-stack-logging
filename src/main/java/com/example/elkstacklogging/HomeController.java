package com.example.elkstacklogging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
@Slf4j
public class HomeController {

    @GetMapping("/warn")
    public String warnLog(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.warn("this is a warn log " + localDateTime);
        return "this is a warn log";
    }
    @GetMapping("/info")
    public String infoLog(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("this is a info log " + localDateTime);
        return "this is a info log";
    }
    @GetMapping("/error")
    public String errorLog(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.error("this is a error log " + localDateTime);
        return "this is a error log";
    }
}
