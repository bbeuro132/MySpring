package com.mh.org2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mh.org2.cls.AA;
import com.mh.org2.cls.BB;

/**
 * Handles requests for the application home page.
 */
@Controller
//@Component
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	AA aa;
	
	@Autowired
	BB bb;
	//AA와 BB는 각각 게터 세터와 생성자만을 갖고 있음
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("aa.getAa() = "+aa.getAa());	
		return "home";
	} //홈 화면, 실행시 aa 속에 있는 int aa 값을 받아와서 콘솔에 출력함
	
	
	@RequestMapping(value = "/bb", method = RequestMethod.GET)
	public String bb(Model model, HttpServletRequest req) {
		
		String number = (String) req.getParameter("bb");
		bb.setAa(Integer.parseInt(number));
		
		System.out.println("bb.getAa() = "+bb.getAa());	
		model.addAttribute("key", bb); //bb.jsp의 key라는 명칭을 가진 값을 bb 객체에 추가한다
		return "bb"; //bb.jsp로 가라
	}
	
	@RequestMapping(value = "/cc", method = RequestMethod.GET)
	public String bb(Model model,String cc) {
		
		/*
		 * null 은 ... 숫자형으로 변경시.. Exception 발생
		 * NumberformatException...
		 * 
		 */
		System.out.println("cc = "+cc);
		System.out.println("bb.getAa() = "+bb.getAa());
		
		model.addAttribute("aoao",bb);
		return "bb";
	}
	
}
