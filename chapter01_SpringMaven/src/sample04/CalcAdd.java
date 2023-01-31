package sample04;

import org.springframework.stereotype.Component;

@Component
public class CalcAdd implements Calc {
//아이디명이 달라지지 않는 이상 굳이 component에 넣을 필요 없다. 자동으로 첫글자만 소문자로 바뀜.
	
	@Override
	public void caculate(int x, int y) {
		int result = x + y;
		System.out.println(x+" + "+y +" = " + result);
	}

}
