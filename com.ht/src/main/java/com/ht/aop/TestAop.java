package com.ht.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author K1081221
 * @version 2019/10/20
 * @description:
 * @modified:
 */
@Component
@Aspect
public class TestAop {

	@Pointcut("execution( * com.ht.service.TestService.test(..))")
	public void pointCut(){

	}

	@Before(value = "pointCut()")
	public void beforeAdvice(){
		System.out.println("===============before  ========");
	}
}
