package com.alipay.spring.test.aop.base;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

/**
 * @author yi.xia
 * @date Create At 2023/2/3
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@Configuration
@Aspect
public class MethodAspect {

    @Around("execution(* com.alipay.spring.test.aop.base.service..*.*(..))")
    public Object methodInvokeLog(ProceedingJoinPoint joinPoint) {
        try {
            Signature signature = joinPoint.getSignature();
            System.out.println("before " + signature.getName());
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            return "Invoke Error!";
        }
    }

}
