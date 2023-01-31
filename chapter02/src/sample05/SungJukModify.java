package sample05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Setter;

@Setter
public class SungJukModify implements SungJuk {
	

	private List<SungJukDTO2> list = null;
	
	
	@Override
	public void execute() {
		
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		
		String name = scanner.next();
		/*for(int i=0;i<list.size();i++) { 
			if(name.equals(list.get(i).getName())) {
				
				System.out.print("국어 점수를 입력하세요 : ");
				list.get(i).setKor(scanner.nextInt());
				System.out.print("수학 점수를 입력하세요 : ");
				list.get(i).setMath(scanner.nextInt());
				System.out.print("영어 점수를 입력하세요 : ");
				list.get(i).setEng(scanner.nextInt());

				list.get(i).calc();
				System.out.println("수정되었습니다.");
			}*/
			
			int sw = 0;
			for(SungJukDTO2 sungJukDTO2 : list) {
				if(sungJukDTO2.getName().equals(name)) {
					sw++;
					System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
					System.out.println(
							sungJukDTO2.getName()+"\t"+
							sungJukDTO2.getKor()+"\t"+
							sungJukDTO2.getEng()+"\t"+
							sungJukDTO2.getMath()+"\t"+
							sungJukDTO2.getTot()+"\t"+
							sungJukDTO2.getAvg());	
					
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
					System.out.println(name+"님의 데이터를 수정하였습니다.");
				}
		
			}//for
			if(sw==0)System.out.println("찾는 이름이 없다");
		
	
	}

}
