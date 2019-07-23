package com.lzj.spring.service.impl;

import com.lzj.spring.interfaces.Performance;
import org.springframework.stereotype.Service;

/**
 * Demo class
 *
 * @author mylzj
 * @date 2019/7/23 22:44
 */
@Service
public class PerformanceImpl implements Performance {
    @Override
    public void perform() {
//        int a=1;
//        int b=0;
//        int c=a/b;
        System.out.println("测试aop");
    }
}
