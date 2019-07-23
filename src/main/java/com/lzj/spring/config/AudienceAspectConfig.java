package com.lzj.spring.config;

import com.lzj.spring.aop.AudienceAspect;
import com.lzj.spring.aop.EncoreableAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Demo class
 *
 * @author mylzj
 * @date 2019/7/23 22:55
 */
@Configuration
//启用Aspect自动代理功能，如果不配，切面只是个bean。不起作用
@EnableAspectJAutoProxy
@ComponentScan
public class AudienceAspectConfig {

    //
    @Bean
    public AudienceAspect audience(){
        return new AudienceAspect();
    }

    @Bean
    public EncoreableAspect encoreableAspect(){
        return new EncoreableAspect();
    }
}
