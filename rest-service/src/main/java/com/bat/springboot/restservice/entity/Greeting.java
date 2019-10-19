package com.bat.springboot.restservice.entity;

/**
 * @Classname Greeting
 * @Description 实体类
 * @Date 2019/10/19 1:04 下午
 * @author dragonbaby308
 */
public class Greeting {
    private final Long id;
    private final String content;

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
