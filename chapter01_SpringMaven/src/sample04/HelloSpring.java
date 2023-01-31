package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class HelloSpring {

	public static void main(String[] args) {
		
		int x =25;
		int y =36;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calc calc = (Calc) context.getBean("calcAdd");
		calc.caculate(x, y);
		
		calc = (Calc) context.getBean("calcMul");
		calc.caculate(x, y);
	}

}
