package sample03;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SungJukImpl implements SungJuk{

	@Autowired//값을 component로 설정을 해놨으니까 autowire하면 값을 주입한다.
	private SungJukDTO sungJukDTO = null;

	/*
	 * Autowired때문에 필요없어짐. 값을 자동으로 줘버리니까. public SungJukImpl(SungJukDTO sungJukDTO)
	 * { super(); this.sungJukDTO = sungJukDTO; }
	 */
	
	
	@Override
	public void calcTot() {
		// TODO Auto-generated method stub
		sungJukDTO.setTot(sungJukDTO.getKor() + sungJukDTO.getMath() + sungJukDTO.getEng());
	}

	@Override
	public void calcAvg() {
		// TODO Auto-generated method stub
		sungJukDTO.setAvg(sungJukDTO.getTot()/3.0);
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(sungJukDTO);
		
	}

	@Override
	public void modify() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		sungJukDTO.setName(scanner.next());
		System.out.print("국어 점수를 입력하세요 : ");
		sungJukDTO.setKor(scanner.nextInt());
		System.out.print("수학 점수를 입력하세요 : ");
		sungJukDTO.setMath(scanner.nextInt());
		System.out.print("영어 점수를 입력하세요 : ");
		sungJukDTO.setEng(scanner.nextInt());
	}

}
