package com.bat.springboot.restservice.controller;

import com.bat.springboot.restservice.entity.Greeting;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author dragonbaby308
 * @Classname GreetingController
 * @Description TODO
 * @Date 2019/10/19 1:09 下午
 */
@RestController
public class GreetingController {
    private static final String TEMPLATE = "Hello, %s"; //%s表示模板中需要填充一个字符串
    private final AtomicLong counter = new AtomicLong();    //原子变量

    @RequestMapping("/greeting")
    /**
     * @Description TODO
     * @param String name
     * @return com.bat.springboot.restservice.entity.Greeting
     * @date 2019/10/19 1:29 下午
     * @author dragonbaby308
     */
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}
