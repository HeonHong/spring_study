package sample03;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SungJukDTO {

	private String name;
	private int kor, eng, math,tot;
	private double avg;
	
	@Override
	public String toString() {
		return name + "\t"+
				kor + "\t"+
				eng + "\t"+
				math + "\t"+
				tot + "\t"+
				String.format("%.2f", avg);
	}
	/* public String getName() { return name; } public void setName(String name) {
						 * this.name = name; } public int getKor() { return kor; } public void
						 * setKor(int kor) { this.kor = kor; } public int getEng() { return eng; }
						 * public void setEng(int eng) { this.eng = eng; } public int getMath() { return
						 * math; } public void setMath(int math) { this.math = math; } public int
						 * getTot() { return tot; } public void setTot(int tot) { this.tot = tot; }
						 * public double getAvg() { return avg; } public void setAvg(double avg) {
						 * this.avg = avg; }
						 */
}
