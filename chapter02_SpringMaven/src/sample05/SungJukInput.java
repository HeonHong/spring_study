package sample05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import sample03.SungJukDTO;

@Component
@Scope("prototype")
public class SungJukInput implements SungJuk {

	
	/*
	 * 스프링 컨테이너가 빈(@Component, @Bean)으로 생성된 것들 중에서 
	 * SungJukDTO2타입을 찾아서 자동으로 주입해라.
	 */
	
	@Autowired
	private SungJukDTO2 sungJukDTO2 = null;
	
	@Autowired
	@Qualifier("arrayList")
	//이게 올 때 springconfig에서 올 때 어떤 타입으로 올지 몰라서 꼭 어떤 클래스로 올지는 알려줘야한다.
	private List<SungJukDTO2> list = null;
	//만약에 qualifier 안 쓸 거면 private ArrayList<SungJukDTO2> list = null;
	/* 생성자 injection
	 * public SungJukInput(SungJukDTO2 sungJukDTO2) { super(); this.sungJukDTO2 =
	 * sungJukDTO2; }
	 */
	
	/*
	 * public void setSungJukDTO2(SungJukDTO2 sungJukDTO2) { this.sungJukDTO2 =
	 * sungJukDTO2; }
	 * 
	 * public void setList(List<SungJukDTO2> list) { this.list = list; }
	 */

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
