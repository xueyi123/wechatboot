/**
 * ---------------------------------------------------------------------------
 * 类名称   ：JedisConfiguration
 * 类描述   ：
 * 创建人   ： xue.yi
 * 创建时间： 2016/8/16 17:05
 * 版权拥有：银信网银科技
 * ---------------------------------------------------------------------------
 */
package com.iih5.springboot.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class JedisConfiguration {
    @Bean(name = "jedisPool")
    public JedisPool jedisPool(@Value("${spring.redis.ip}") String ip,
                                      @Value("${spring.redis.port}") int port,
                                      @Value("${spring.redis.timeout}") int timeout,
                                      @Value("${spring.redis.auth}") String auth,
                                      @Value("${spring.redis.select}") int select) {
        JedisPoolConfig config = new JedisPoolConfig();
        return  new JedisPool(config,ip,port,timeout,auth,select);
    }
}
