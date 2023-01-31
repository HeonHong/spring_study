package sample05;

import java.util.ArrayList;
import java.util.List;

import lombok.Setter;

public class SungJukOutput implements SungJuk {

	@Setter
	private List<SungJukDTO2> list = null;
	
	/*
	 * public void setList(List<SungJukDTO2> list) { this.list = list; }
	 */
	@Override
	public void execute() {
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
		/*
		 * for(int i=0;i<list.size();i++) { System.out.println(
		 * list.get(i).getName()+"\t"+ list.get(i).getKor()+"\t"+
		 * list.get(i).getEng()+"\t"+ list.get(i).getMath()+"\t"+
		 * list.get(i).getTot()+"\t"+ list.get(i).getAvg()+"\t"); }
		 */
		
		for(SungJukDTO2 sungJukDTO2 : list) {
				System.out.println(
						sungJukDTO2.getName()+"\t"+
						sungJukDTO2.getKor()+"\t"+
						sungJukDTO2.getEng()+"\t"+
						sungJukDTO2.getMath()+"\t"+
						sungJukDTO2.getTot()+"\t"+
						sungJukDTO2.getAvg());	
		}
		System.out.println();
	
		
		
	}

	

}
