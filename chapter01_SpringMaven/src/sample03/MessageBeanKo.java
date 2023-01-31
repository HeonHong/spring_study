package sample03;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("messageBean")
@Scope("prototype")
public class MessageBeanKo implements MessageBean {
//application에 있는 bean 대신 component를 사용
//application에 있는 scope 대신 scope 사용
	private int num;//필드, 초기화됨.
	
	public MessageBeanKo() {
		System.out.println("MessageBeanKo 기본생성자");
	}
	
	@Override
	public void sayHello(String name) {
		num++;
		System.out.println("num = "+ num);
		System.out.println("안녕하세요 " + name);
	}

}
