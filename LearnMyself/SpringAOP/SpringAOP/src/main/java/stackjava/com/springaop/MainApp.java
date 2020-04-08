package stackjava.com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = (Hello) context.getBean("helloProxy");
		hello.method1();
		System.out.println("\n");
		hello.method2();
		System.out.println("\n");
		hello.method3();
	}
}
