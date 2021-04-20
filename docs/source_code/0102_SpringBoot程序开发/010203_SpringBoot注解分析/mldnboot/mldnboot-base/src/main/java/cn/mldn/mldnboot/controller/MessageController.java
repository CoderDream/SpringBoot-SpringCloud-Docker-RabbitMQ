package cn.mldn.mldnboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller								// 建立控制器
public class MessageController {
	@RequestMapping("/")				// 访问映射路径
	@ResponseBody						// rest返回形式
	public String home() {				// 控制器方法
		return "www.mldn.cn";			// 返回信息
	}
}
