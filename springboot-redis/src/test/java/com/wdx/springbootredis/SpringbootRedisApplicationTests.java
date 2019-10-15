package com.wdx.springbootredis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Autowired
    StringRedisTemplate stringRedisTemplate; //操作字符串

    @Autowired
    RedisTemplate redisTemplate; //操作K-V 都是对象

    @Test
    public void contextLoads() {
        stringRedisTemplate.boundValueOps("www").set("123",10L, TimeUnit.SECONDS); //设置过期时间10秒
        String www = stringRedisTemplate.opsForValue().get("www");
        System.out.println(www);
    }


}
