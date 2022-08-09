package com.example.springAop.config;


import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopConfig {

    @Around("execution(* com.example.springAop..*(..))")
    public Object excute(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(joinPoint.toString() + "들어가기전");
        try {
            return joinPoint.proceed();
        } finally {
            System.out.println(joinPoint.toString() + "들어간 후");
        }
    }
}
