package com.lzj.spring;

import com.lzj.spring.pojo.BraveKnight;
import com.lzj.spring.pojo.KillDragonQuest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void contextLoads() {


        //构造器注入依赖
//        BraveKnight braveKnight = new BraveKnight(new KillDragonQuest());
//        braveKnight.embrakQuest();

        //使用上下文创建bean注入依赖
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BraveKnight bean = context.getBean(BraveKnight.class);
        bean.embrakQuest();
    }

}
