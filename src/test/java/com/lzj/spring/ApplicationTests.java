package com.lzj.spring;

import com.lzj.spring.interfaces.Performance;
import com.lzj.spring.pojo.BraveKnight;
import com.lzj.spring.pojo.KillDragonQuest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    Performance performance;
    @Test
    public void contextLoads() {


        //构造器注入依赖
//        BraveKnight braveKnight = new BraveKnight(new KillDragonQuest());
//        braveKnight.embrakQuest();

        //使用上下文创建bean注入依赖
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BraveKnight bean = context.getBean(BraveKnight.class);
        bean.embrakQuest();
    }

    @Test
    public void testAop(){
        performance.perform();
    }

}
