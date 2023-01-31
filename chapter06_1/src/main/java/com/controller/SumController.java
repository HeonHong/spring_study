package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.SumDTO;

@Controller
public class SumController {

	// @RequestMapping(value="/input.do", method = RequestMethod.GET )
	@GetMapping(value = "/input.do")
	public String input() {
		return "/WEB-INF/sum/input";
	}

	// @PostMapping(value="/result.do")
	/* @GetMapping(value="/result.do") 
	 * public String result() { 
	 * return "/WEB-INF/sum/result"; 
	 * }
	 */

	
	/*
	 * @GetMapping(value="/result.do") public ModelAndView
	 * result(@RequestParam(required = false, defaultValue ="0") String x,
	 * 
	 * @RequestParam(required = false, defaultValue ="0") String y) {
	 * 
	 * //defaultValue ="0" 나중에 페이지 값 잡을 때 쓰기 좋다. //public ModelAndView
	 * result(@RequestParam int x, @RequestParam int y) { //매개변수 인자 잘 못 받으면 400에러 뜬다
	 * ModelAndView mav = new ModelAndView(); mav.addObject("x",x);
	 * mav.addObject("y",y); mav.setViewName("/WEB-INF/sum/result");
	 * 
	 * 
	 * return mav;
	 * 
	 * }
	 */

	/*
	 * @GetMapping(value = "/result.do") public String result(@RequestParam Map<String, String> map, ModelMap modelMap) {
	 * 
	 * modelMap.put("x",map.get("x")); 
	 * modelMap.put("y",map.get("y"));
	 * 
	 * return "/WEB-INF/sum/result";
	 * 
	 * }
	 */
	/*
	 * 
	 * @GetMapping(value = "/result.do") 
	 * public String result(@ModelAttribute SumDTO sumDTO, ModelMap modelMap) {
	 * 
	 * modelMap.put("x",sumDTO.getX()); 
	 * modelMap.put("y",sumDTO.getY());
	 * 
	 * 
	 * return "/WEB-INF/sum/result";
	 * 
	 * }
	 * 
	 */
	
	@GetMapping(value = "/result.do")
	public String result(@ModelAttribute SumDTO sumDTO, Model model) {
		//set은 알아서 맞춰서 해놓는다
		model.addAttribute("x",sumDTO.getX());
		model.addAttribute("y",sumDTO.getY());
		//sumDTO를 통째로 보내도 된다. 그러면 jsp에서 sumDTO.x로 받아야 한다.

		return "/WEB-INF/sum/result";

	}
}
