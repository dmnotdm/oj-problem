package com.zzz.oj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by zhizhao.zhang on 2019/02/02 19:13.
 * Description:
 */
@EnableEurekaClient
@SpringBootApplication
public class ProblemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProblemApplication.class, args);
    }

}
