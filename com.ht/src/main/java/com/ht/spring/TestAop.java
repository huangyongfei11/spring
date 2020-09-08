package com.ht.spring;

import com.ht.config.AppConfig;
import com.ht.service.TestService;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author K1081221
 * @version 2019/10/20
 * @description:
 * @modified:
 *
 * 在 springmvc 中将 aop 生成代理类字节码，以文件形式输出
 * 在系统运行期间设置系统参数（即上面测试中的两个设置）：
 *  设置此系统属性,让JVM生成的Proxy类写入文件
 * System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
 * //设置将cglib生成的代理类字节码生成到指定位置
 System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D:/Temp/code/cglib");
 */
public class TestAop {


	public static void main(String[] args) {
		/* 设置此系统属性,让JVM生成的Proxy类写入文件 */
		System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "C:\\Users\\hyf\\Desktop\\项目管理\\spring\\com" +
				".ht\\src\\main\\resources");
		/**
		 * 把类扫描出来
		 * 把bean实例化
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		TestService bean = context.getBean(TestService.class);
//		TestService bean = (TestService)context.getBean("testService");
		bean.test();
		bean.test2();

		System.out.println(bean);

	}

}
