package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {
	

	public static void main(String[] args) {

		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//싱글톤으로 생성된다.
		MessageBean messageBean = (MessageBean) context.getBean("messageBean");//자식 = 부모. 원형 Object
		messageBean.sayHello("Spring");
		System.out.println();
		
		MessageBean messageBean2 = context.getBean("messageBean", MessageBean.class);//자식 = 부모
		messageBean2.sayHello("Spring");
		System.out.println();
	}

}
