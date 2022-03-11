package com.school.aspect;

import java.util.logging.Logger;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* com.school.controller.*.*(..))")
	private void forControllerPack() {
		
	}
	
	@Pointcut("execution(* com.school.service.*.*(..))")
	private void forServicePack() {
		
	}
	
	@Pointcut("execution(* com.school.dao.*.*(..))")
	private void forDaoPack() {
		
	}
	
	@Pointcut("forControllerPack() || forServicePack() || forDaoPack()")
	private void forAppFlow() {
		
	}
	
	@Before("forAppFlow()")
	public void before(JoinPoint joinPoint) {
		String method = joinPoint.getSignature().toShortString();
		logger.info("====> in @Before: calling method: " + method);
	
	
		Object[] argsObjects = joinPoint.getArgs();
		
		for(Object tempArgObject : argsObjects) {
			logger.info(" arg ====> " + tempArgObject);
		}

	}
	
	@AfterReturning(pointcut = "forAppFlow()", returning ="res")
	public void afterReturning(JoinPoint joinPoint, Object res) {
		
		String method = joinPoint.getSignature().toShortString();
		logger.info("====> in @AfterReturning: calling method: " + method);
	
		logger.info(" result ====> " + res);
		
		
	}
	
	
}
