package sample05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lombok.Setter;

@Setter
public class SungJukDelete implements SungJuk {
	private List<SungJukDTO2> list = null;
	private SungJukDTO2 sungJukDTO2 = null;
	
	@Override
	public void execute() {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		
		String name = scanner.next();
		
		int sw = 0;
		/*
		 * for(SungJukDTO2 sungJukDTO2 : list) { if(sungJukDTO2.getName().equals(name))
		 * { list.remove(sungJukDTO2); } }
		 */
		Iterator<SungJukDTO2> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO2 sungJukDTO2 = it.next();
			
			if(sungJukDTO2.getName().equals(name)) {
				sw=1;
				it.remove();
				System.out.println(name+"님의 데이터를 삭제하였습니다.");
				
			}
		}
		
	}

}
