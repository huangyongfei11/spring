package com.ht.spring;

import com.ht.config.AppConfig;
import com.ht.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author K1081221
 * @version 2019/9/20
 * @description:
 * @modified:
 */
public class Test {

	public static void main(String[] args) {
		/**
		 * 把类扫描出来
		 * 把bean实例化
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		TestService bean = context.getBean(TestService.class);
//MyBeanFactoryPostProcessor结合看
//		Test bean = context.getBean(Test.class);
		bean.test();
//		System.out.println();

	}
}
