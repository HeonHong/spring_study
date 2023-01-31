package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring03 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextFile.xml");
		MessageBean messageBean = (MessageBean) context.getBean("messageBeanImpl2");
		messageBean.helloCall();

	}

}
