package sample05;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class SungJukImpl implements SungJuk {

	private String name;
	private int korean, english, math, total;
	private double avg;
	
	public SungJukImpl() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 입력하세요 : ");
		name = scanner.next();
		System.out.print("국어 점수 입력하세요 : ");
		korean = scanner.nextInt();
		System.out.print("영어 점수 입력하세요 : ");
		english = scanner.nextInt();
		System.out.print("수학 점수 입력하세요 : ");
		math = scanner.nextInt();
		System.out.println();
	}
	
	@Override
	public void calc() {
		total = korean + english + math;
		avg = total/3.0;

	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name + "\t" + korean + "\t" 
							+ english + "\t" + math + "\t" 
							+ total + "\t" + avg);

	}


}
