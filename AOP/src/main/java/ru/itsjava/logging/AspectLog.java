package ru.itsjava.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLog {
    @Before("execution (* ru.itsjava.dao.CoffeeDao.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Log before " + joinPoint.getSignature().getName());
    }

    @After("execution (* ru.itsjava.dao.CoffeeDao.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Log after " + joinPoint.getSignature().getName());
    }

    @Around("execution (* ru.itsjava.dao.CoffeeDao.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Log around " + joinPoint.getSignature().getName());
        Object res = joinPoint.proceed();
        System.out.println("Log around " + joinPoint.getSignature().getName());

        return res;
    }
}