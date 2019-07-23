package com.lzj.spring.aop;

import com.lzj.spring.service.Encoreable;
import com.lzj.spring.service.impl.EncoreableImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Demo class
 *
 * @author mylzj
 * @date 2019/7/24 0:52
 */
@Aspect
public class EncoreableAspect {

    @DeclareParents(value = "com.lzj.spring.interfaces.Performance+",
                    defaultImpl = EncoreableImpl.class)
    public static Encoreable encoreable;
}
