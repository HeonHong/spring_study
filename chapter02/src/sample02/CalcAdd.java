package sample02;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CalcAdd implements calc {
	private int x,y;

	
	/*
	 * public CalcAdd(int x, int y) { super(); this.x = x; this.y = y; }
	 */

	@Override
	public void caculate() {
		System.out.println(x+"+"+y+"="+(x+y));	
	}

}
