package sample05;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import sample05.SungJuk;

@Component
public class HelloSpring05 {
	//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextFile.xml");
	//계속 살아있으니까 웬만하면 하지 말 것.
	public void menu(ApplicationContext context) {
		int i=0;
		SungJuk sungJuk=null;
		ArrayList<SungJukDTO2> list = new ArrayList<SungJukDTO2>();
		while(i<5) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("********");
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.수정");
			System.out.println("4.삭제");
			System.out.println("5.끝");
			System.out.println("********");
			int input = scanner.nextInt();
			if(input==1) {
				sungJuk = (SungJuk) context.getBean("sungJukInput"); 
				i++;
			}else if(input==2){ 
				sungJuk = (SungJuk) context.getBean("sungJukOutput");
			}else if(input==3){ 
				sungJuk = (SungJuk) context.getBean("sungJukModify");
			}else if(input==4){ 
				sungJuk = (SungJuk) context.getBean("sungJukDelete");
			}else if(input==5){ break; }
				 
			
			sungJuk.execute();
			
		}
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextFile.xml");
		HelloSpring05 helloSpring05 = (HelloSpring05) context.getBean("helloSpring05");
		//이건 바뀌는 클래스가 아니라서 굳이 이렇게 해 줄 필요는 없긴하다.
		helloSpring05.menu(context);
		System.out.println("프로그램을 종료합니다.");
	}

}
