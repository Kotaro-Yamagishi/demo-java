package com.example.demo.contoller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

@RestController
@RequestMapping("/log")
public class LogController {
    private static final Logger log = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/info")
    public String logInfo() {
        log.info("info:api call!");
        return "Log output successful!";
    }

    @GetMapping("/warn")
    public String logWarn() {
        log.warn("warn:api call!");
        return "Log output successful!";
    }

    @GetMapping("/error")
    public String logError() {
        log.error("error:api call!");
        return "Log output successful!";
    }
}
