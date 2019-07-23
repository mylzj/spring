package com.lzj.spring.pojo;

import com.lzj.spring.interfaces.Knight;
import com.lzj.spring.interfaces.Quest;

/**
 * Demo class
 *
 * @author drose
 * @date 2019/5/21 21:57
 */
public class BraveKnight implements Knight {

    private Quest quest;

    //    public BraveKnight(){};
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embrakQuest() {
        quest.commonQuest();
    }
}
