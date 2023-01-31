package sample02;

import lombok.Setter;

@Setter
public class CalcMul implements calc {
	private int x,y;

	/*
	 * public void setX(int x) { this.x = x; }
	 * 
	 * public void setY(int y) { this.y = y; }
	 */
	@Override
	public void caculate() {
		System.out.println(x+"*"+y+"="+(x*y));
	}

}
