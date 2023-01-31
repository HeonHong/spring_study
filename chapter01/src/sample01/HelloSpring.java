package sample01;

public class HelloSpring {

	public static void main(String[] args) {
		//웹 아니다.
		MessageBean messageBean = new MessageBean();//인스턴스 생성. 생성자가 따라붙는다.
		//객체 생성 + 생성자
		messageBean.sayHello("Spring");
		
	}

}
