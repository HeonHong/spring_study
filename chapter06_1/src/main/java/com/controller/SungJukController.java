package com.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.SungJukDTO;
import com.bean.SungJukDTO2;

import javax.servlet.http.HttpServletRequest;

//@Controller 얘를 죽여도 되나? 클래스에 requestMapping있으면 controller인 거 인식한다.
@RequestMapping(value = "/sungJuk")
public class SungJukController {

	
	
	@RequestMapping(value="/input.do", method = RequestMethod.GET )
	public String input() {
		return "/WEB-INF/sungJuk/input";
	}
	
	/*
	@RequestMapping(value="/sungJuk/result.do", method = RequestMethod.POST )
	public String result(@ModelAttribute SungJukDTO sungJukDTO, ModelMap modelMap) {
		
		sungJukDTO.calc();
		modelMap.put("sungJukDTO", sungJukDTO);
		
		return "/WEB-INF/sungJuk/result";
	}
	*/
	
	//get방식이면 한글이 깨지지 않지만 post방식이면 깨진다. 그래서 xml에 filter로 걸러야한다.
	@PostMapping(value = "/result.do")//(value = "/sungJuk/result.do") 위에 클래스에 mapping해놔서 빼도 됨.
	public String result(@ModelAttribute SungJukDTO2 sungJukDTO2, Model model) {
		int tot = sungJukDTO2.getKor() + sungJukDTO2.getEng() + sungJukDTO2.getMath();
		double avg = (double)tot/3;
		
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);
	
		model.addAttribute("sungJukDTO2", sungJukDTO2);
		return "/WEB-INF/sungJuk/result";
	}
	
	/*
	@RequestMapping(value="/sungJuk/result.do", method = RequestMethod.GET )
	public ModelAndView result(HttpServletRequest request) {
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		SungJukDTO sungJukDTO=new SungJukDTO();
		sungJukDTO.setName(name);
		sungJukDTO.setKor(kor);
		sungJukDTO.setEng(eng);
		sungJukDTO.setMath(math);
		sungJukDTO.calc();
		int tot = sungJukDTO.getTot();
		double avg = sungJukDTO.getAvg();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", name);
		mav.addObject("tot", tot);
		mav.addObject("avg", avg);
		mav.setViewName("/WEB-INF/sungJuk/result");
		
		return mav;
	}
	*/
	
}
