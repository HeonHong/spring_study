package spring.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;
import sample05.SungJukDTO2;

@Configuration//springconf한테 new 시켜주는 거다.
public class SpringConfiguration {
	//applicationContext.xml을 대신해주는 자바 파일이다. 이름은 고정은 아니다. Bean을 만들어 주는 자바 class이다.
	//sample01
	@Bean
	public MessageBeanImpl messageBeanImpl(){
		return new MessageBeanImpl("사과");//얘를 bean으로 생성해라.
	}
	//sample02
	@Bean
	public CalcAdd calcAdd() {
		return new CalcAdd(30,50);//여기다 값을 넣어주면 value값 사라짐.
	}
	
	@Bean(name="calcMul")
	public CalcMul getCalcMul() {
		return new CalcMul();//여기다 값을 넣어주면 value값 사라짐.
	}
	
	//sample05
	@Bean
	//public ArrayList<SungJukDTO2> arrayList(){
	public List<SungJukDTO2> arrayList(){
		return new ArrayList<SungJukDTO2>();
		//이러면 싱글톤으로 가는 건가???그럼 여기서 prototype이 필요하면?
	}
	
}

/* 
@Bean 
- return되는 클래스를 bean으로 생성한다.
- 반드시 메소드명은 id명으로 설정해야한다.

xml, annotation, java파일 3가지로 생성
*/
