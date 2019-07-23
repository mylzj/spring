package com.lzj.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Demo class
 *
 * @author mylzj
 * @date 2019/7/23 22:46
 */
@Aspect
public class AudienceAspect {
    @Pointcut("execution(* com.lzj.spring.interfaces.Performance.perform(..))")
    public void perform(){}

//    @Before("perform()")
//    public void silenceCellPhone(){
//        System.out.println("演出前，测试前置通知");
//    }
//
//    @After("perform()")
//    public void takeSeats(){
//        System.out.println("演出结束，测试后置通知");
//    }
//
//    @AfterReturning("perform()")
//    public void applause(){
//        System.out.println("表演结束，测试返回通知");
//    }
//
//    @AfterThrowing("perform()")
//    public void demandRefund(){
//        System.out.println("表演失败，测试异常通知");
//    }

    //环绕通知
    @Around("perform()")
    public void aroundPerform(ProceedingJoinPoint point){
        try {
            System.out.println("演出前，测试环绕的前置通知");
            System.out.println("演出结束，测试环绕的后置通知");
            //执行被通知的方法
            point.proceed();
            System.out.println("表演结束，测试环绕的返回通知");
        }catch (Throwable e){
            System.out.println("表演失败，测试环绕的异常通知");
        }
    }
}
