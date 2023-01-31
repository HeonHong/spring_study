package sample02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component /* ("calcAdd") */ >> 자바파일로 만들겠다.
public class CalcAdd implements calc {
	private int x,y;

	
	
	public CalcAdd(@Value("25") int x,@Value("36") int y) {
		super(); 
		this.x = x; 
		this.y = y; 
		}
	 

	@Override
	public void caculate() {
		System.out.println(x+"+"+y+"="+(x+y));	
	}

}
