package com.Lee.org3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 1. 자바 버전 맞추기
 * build path
 * project facets
 * 2. web.xml j 소문자를 J 대문자로
 * 
 * 3.Pojo 방식을 사용하기 위한
 * cglib.jar 파일 maven으로부터 가져오기
 * contextLannotationconfig 태그 설정
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		
		return "insert";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(Locale locale, Model model) {
		
		return "delete";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Locale locale, Model model) {
		
		return "update";
	}
	
	@RequestMapping(value = "/cc", method = RequestMethod.GET)
	@ResponseBody //cc라는 글자가 그냥 날아감
	public String cc(Locale locale, Model model) {
		
		return "cc"; //여기의 글자가 날아감
	}
}
