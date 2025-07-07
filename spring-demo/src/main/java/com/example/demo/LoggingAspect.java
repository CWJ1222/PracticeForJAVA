package com.example.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.demo.UserService.*(..))")
    public void logBefore() {
        System.out.println("[AOP] UserService의 메서드가 호출됩니다.");
    }
}