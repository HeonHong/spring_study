package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		
		int x =25;
		int y =36;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calc calc = (Calc) context.getBean("calc1");
		calc.caculate(x, y);
		
		calc = (Calc) context.getBean("calc2");
		calc.caculate(x, y);
	}

}
