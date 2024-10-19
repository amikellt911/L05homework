package com.example.studentiocaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // 定义切点，匹配StudentService中的所有方法
    @Pointcut("execution(* com.example.studentiocaop.service.StudentService.*(..))")
    public void studentServiceMethods() {}

    // 在方法执行前输出日志
    @Before("studentServiceMethods()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before method: " + joinPoint.getSignature().getName());
    }

    // 在方法成功执行后输出日志
    @AfterReturning(pointcut = "studentServiceMethods()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("After method: " + joinPoint.getSignature().getName());
        if (result != null) {
            System.out.println("Method result: " + result.toString());
        }
    }

    // 在方法抛出异常时输出日志
    @AfterThrowing(pointcut = "studentServiceMethods()", throwing = "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("Exception in method: " + joinPoint.getSignature().getName());
        System.out.println("Exception: " + error.getMessage());
    }
}
