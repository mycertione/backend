package com.example.backend.controller;

import com.example.backend.service.RedisService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisController {

    private final RedisService redisService;

    public RedisController(RedisService redisService){
        this.redisService = redisService;
    }

    @PostMapping("/set")
    public String set(@RequestParam String key, @RequestParam String value){
        redisService.setValue(key, value);
        return "Saved!";
    }

    @GetMapping("/get")
    public String get(@RequestParam String key){
        return redisService.getValue(key);
    }

}
