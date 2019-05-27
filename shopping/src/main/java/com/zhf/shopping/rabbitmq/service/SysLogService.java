package com.zhf.shopping.rabbitmq.service;

import com.zhf.shopping.rabbitmq.entity.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class SysLogService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void saveLogger(SysLog sysLog) {
        mongoTemplate.save(sysLog);
    }
}
