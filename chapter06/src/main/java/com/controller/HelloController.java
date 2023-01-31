package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller//핸들러 맵핑이 찾아준다.
public class HelloController {

	@RequestMapping(value="/hello.do", method=RequestMethod.GET)//핸들러 맵핑이 찾아준다.
	public ModelAndView hello(){//mapping value와 동일하게
		ModelAndView mav = new ModelAndView();
		mav.addObject("result","Have a good one");//setAttribute같은 느낌
		/* mav.setViewName("hello"); */
		mav.setViewName("/WEB-INF/view/hello"); 
		// >>이 파일은 dispatcherServlet-servlet의 값을 가져와서 /view/hello.jsp 이런 형태로 변경된다.
		
		return mav;
	}
	
	@RequestMapping(value="/hello2.do", method=RequestMethod.GET, produces = "text/html; charset=UTF-8")
	@ResponseBody
	public String hello2(){
		return "하이하이하이hi";
		//"return Welcome";
		//spring에서는 String타입으로 작성해서 출력을하려고하면 jsp파일명으로 인식을 한다.
		//스프링에서는 리턴타입이 String이면 단순문자열이 아니라, 파일명으로 인식한다.
		//스프링은 welcome.jsp파일을 찾는다.
		//만약 단순 문자열로 웹에 나타내려면 @ResponseBody를 써야한다.
	}
	
	
	
}

/*
 * 콜백 메소드란? 서블릿 주기 함수 존재 init, doget, dodestroy가 포함됨.
 *  자바에서는 jdk 등 다른 곳들에서도 일정
 * 내가 부른 것이 아니라 일정 시점에서 운영체제가 실행함.
 * 원래는 만들어 놓은 것들을 override시켜서 사용하는데 spring 에서는 사용자가 만든 콜백 메소드로 해결해줌(매핑을 했기때문에 가능).
 */



/*
 * 스프링 설정파일
	src/appicationContext.xml이 기본이었으나
 *web inf로 넣어준다.
 * 스프링 설정 아웹 /Web-INF/서블릿 이름.xml
 * /Web-INF/dispatcherServlet-servlet.xml
 */