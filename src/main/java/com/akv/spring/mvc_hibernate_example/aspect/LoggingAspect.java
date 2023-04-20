package com.akv.spring.mvc_hibernate_example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    //аспект для отслеживания начала и конца работы методов, которые непосредственно связываются с базой данных
    //т.е. для всех методов в папке dao
    //в папке по пути, методы любого типа, названия, сколько угодно параметров.*.*(..)
@Around("execution(* com.akv.spring.mvc_hibernate_example.dao.*.*(..))")
    public Object aroundAllRepositoryMethodAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
    MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
    String nameMethod =methodSignature.getName();
    System.out.println("begin of " + nameMethod);
    Object result = proceedingJoinPoint.proceed();
    System.out.println("End of " + nameMethod);
    System.out.println("*******************************************************");

    return result;
}
}
