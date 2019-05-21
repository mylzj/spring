package com.lzj.spring.aop;

/**
 * Demo class
 *
 * @author drose
 * @date 2019/5/21 23:00
 */
public class Minstrel {
    public Minstrel(){}

    public void singBeforeQuest(){
        System.out.println("骑士准备要执行任务了");
    }

    public void singAfterQuest(){
        System.out.println("骑士顺利完成任务了");
    }
}
