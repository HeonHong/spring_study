package sample02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;

//@Setter
//@Component
public class CalcMul implements calc {
	private int x,y;

	@Autowired
	  public void setX(@Value("25") int x) { this.x = x; }
	@Autowired  
	  public void setY(@Value("36") int y) { this.y = y; }
	 
	@Override
	public void caculate() {
		System.out.println(x+"*"+y+"="+(x*y));
	}

}
