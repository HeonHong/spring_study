package sample05;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SungJuk sungjuk = (SungJuk) context.getBean("sungjuk");
		sungjuk.calc();
		sungjuk.display();
	}

}
