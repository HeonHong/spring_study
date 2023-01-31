package sample01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component 자바 파일로 잡았기 때문에
public class MessageBeanImpl implements MessageBean {
	
	private String fruit;
	private int cost, qty;
	
	public MessageBeanImpl(@Value("사과") String fruit) {
		this.fruit = fruit;
		//이건 spring에 있는 value
	}
	
	//xml 뺐을 때는 setter는 생성자가 아니니까 따로 연결 해줘야함.
	@Autowired
	public void setCost(@Value("5000") int cost) {
		this.cost = cost;
	}

	@Autowired
	public void setQty(@Value("3") int qty) {
		this.qty = qty;
	}

	
	
	@Override
	public void sayHello() {
		System.out.println(fruit + "\t" + cost + "\t" + qty);
	}

	@Override
	public void sayHello(String fruit, int cost) {
		System.out.println(fruit + "\t" + cost + "\t" + qty);
	}

	@Override
	public void sayHello(String fruit, int cost, int qty) {
		System.out.println(fruit + "\t" + cost + "\t" + qty);
	}
	
}
