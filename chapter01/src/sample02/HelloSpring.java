package sample02;

public class HelloSpring {

	public static void main(String[] args) {
		
		//결합도 낮추기. 다형성. 부모=자식
		MessageBean messageBean = new MessageBeanEn();
		messageBean.sayHello("Spring");
	}

}
