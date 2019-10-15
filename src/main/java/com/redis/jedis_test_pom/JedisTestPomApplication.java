package com.redis.jedis_test_pom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JedisTestPomApplication {

    public static void main(String[] args) {
        SpringApplication.run(JedisTestPomApplication.class, args);
    }

}
