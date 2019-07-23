package com.lzj.spring.service.impl;

import com.lzj.spring.service.Encoreable;

/**
 * Demo class
 *
 * @author mylzj
 * @date 2019/7/24 0:50
 */
public class EncoreableImpl implements Encoreable {

    @Override
    public void performEncore() {
        System.out.println("正在使用Encoreable");
    }
}
