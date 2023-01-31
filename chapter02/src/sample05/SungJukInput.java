package sample05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sample03.SungJukDTO;

public class SungJukInput implements SungJuk {

	private SungJukDTO2 sungJukDTO2 = null;
	private List<SungJukDTO2> list = null;
	/* 생성자 injection
	 * public SungJukInput(SungJukDTO2 sungJukDTO2) { super(); this.sungJukDTO2 =
	 * sungJukDTO2; }
	 */
	
	public void setSungJukDTO2(SungJukDTO2 sungJukDTO2) {
		this.sungJukDTO2 = sungJukDTO2;
	}
	
	public void setList(List<SungJukDTO2> list) {
		this.list = list;
	}

	@Override
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		sungJukDTO2.setName(scanner.next());
		//선생님 방식 String name = scanner.next();
		System.out.print("국어 점수를 입력하세요 : ");
		sungJukDTO2.setKor(scanner.nextInt());
		System.out.print("수학 점수를 입력하세요 : ");
		sungJukDTO2.setMath(scanner.nextInt());
		System.out.print("영어 점수를 입력하세요 : ");
		sungJukDTO2.setEng(scanner.nextInt());

		sungJukDTO2.calc();
		
		//DB
		
		
		//응답
		//System.out.println(name+"님의 데이터가 입력되었습니다.");
		
		list.add(sungJukDTO2);
		System.out.println(list);
		
		
	}

	
}
