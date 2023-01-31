package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextFile.xml");
		calc calc;
		calc = context.getBean("calcAdd", CalcAdd.class);
		calc.caculate();
		
		calc = context.getBean("calcMul", CalcMul.class);
		calc.caculate();
		
	}
}
