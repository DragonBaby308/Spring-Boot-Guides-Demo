package com.bat.springboot.restservice.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dragonbaby308
 * @Classname ScheduledTasks
 * @Description 定期任务
 * @Date 2019/10/19 1:34 下午
 */
public class ScheduledTasks {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    /**
     * @Description 定义定期任务，fixedRate是执行频率，每过5s执行一次
     * @param null
     * @return null
     * @date 2019/10/19 1:39 下午
     * @author dragonbaby308
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        LOGGER.info("现在时间：{}", DATE_FORMAT.format(new Date()));
    }
}
