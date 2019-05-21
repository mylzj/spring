package com.lzj.spring.pojo;

import com.lzj.spring.interfaces.Quest;

/**
 * Demo class
 *
 * @author drose
 * @date 2019/5/21 22:00
 */
public class KillDragonQuest implements Quest {
    @Override
    public void commonQuest() {
        System.out.println("执行铲除恶龙的任务");
    }
}
