package cn.mldn.mldnboot.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.mldn.mldnboot.vo.Member;

@Controller
public class ThymeleafController {
	@GetMapping("/list")
	public String list(Model model) throws Exception {
		List<Member> allMembers = new ArrayList<Member>() ;
		for (int x = 0 ; x < 5 ; x ++) {
			Member vo = new Member() ;
			vo.setMid("mldnjava - " + x);
			vo.setName("李兴华 - " + x);
			vo.setSalary(3500.00);
			vo.setAge(16 + x);
			vo.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1998-09-15"));
			allMembers.add(vo) ;
		}
		model.addAttribute("allMembers", allMembers) ;		// 传递页面属性
		return "message/message_list" ; 
	}
	
	@GetMapping("/member")
	public String member(Model model) throws Exception {
		Member vo = new Member() ;
		vo.setMid("mldnjava");
		vo.setName("李兴华");
		vo.setSalary(3500.00);
		vo.setAge(18);
		vo.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1998-09-15"));
		model.addAttribute("member", vo) ;		// 传递页面属性
		return "message/message_member" ;
	}
	
	@GetMapping("/attr")
	public String attr() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest(); 			// 获取HttpServletRequest内置对象
		request.setAttribute("requestMessage", "request - www.mldn.cn");
		request.getSession().setAttribute("sessionMessage", "session - www.mldnjava.cn");
		request.getServletContext().setAttribute("applicationMessage", "application - www.jixianit.com");
		return "message/message_attr";
	}
	
	@GetMapping("/path")
	public String path() {
		return "message/message_path"; 
	}
	@GetMapping("/value")
	public String value() {
		return "message/message_value"; 
	}
	@GetMapping("/view")
	public String view(String mid, Model model) {
		model.addAttribute("url", "<h1><span style='color:red'>www.mldn.cn</span></h1>");
		model.addAttribute("mid", mid); 			// request属性传递包装
		return "message/message_show"; 				// 此处只返回一个路径， 该路径没有设置后缀，后缀默认是*.html
	}
}
