package com.Lee.org3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Lee.org3.db.DBManager;

@Controller //homecontroller와 같이 싱글톤 패턴으로 나뉘어있다
public class ProcController {
	
	@Autowired
	DBManager dbm;
	
	@RequestMapping(value="/insertproc", method = RequestMethod.POST)
	public String insertproc(Model model, String para1, String para2) {
		
		dbm.insertTest(para1, para2);
		
		return "insertproc";
	}
	
	@RequestMapping(value="/deleteproc", method = RequestMethod.POST)
	public String deleteproc(Model model, String para1) {
		
		dbm.deleteTest(para1);
		
		return "deleteproc";
	}
	
	@RequestMapping(value="/updateproc", method = RequestMethod.POST)
	public String updateproc(Model model, String para1, String para2) {
		
		dbm.updateTestPara1(para1, para2);
		
		return "updateproc";
	}
}
