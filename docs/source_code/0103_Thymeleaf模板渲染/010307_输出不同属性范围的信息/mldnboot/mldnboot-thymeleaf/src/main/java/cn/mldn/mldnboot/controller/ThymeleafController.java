package cn.mldn.mldnboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class ThymeleafController {
	
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
