package com.bean;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class SungJukDTO2 {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	public void calc() {
		tot = kor + eng + math;
		avg=tot/3.0;
		
	}
	
	@Override
	public String toString() {
		return name + "\t"+
				kor + "\t"+
				eng + "\t"+
				math + "\t"+
				tot + "\t"+
				String.format("%.2f", avg);
	}
}
