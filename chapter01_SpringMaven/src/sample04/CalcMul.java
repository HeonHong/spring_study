package sample04;

import org.springframework.stereotype.Component;

@Component("calcMul")
public class CalcMul implements Calc {

	@Override
	public void caculate(int x, int y) {
		int result = x * y;
		System.out.println(x + " * " + y + " = " + result);		
	}

}
