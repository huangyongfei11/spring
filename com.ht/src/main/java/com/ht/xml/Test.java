package com.ht.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2021/5/27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		User user = applicationContext.getBean("user", User.class);

		System.out.println(user);


	}
}
