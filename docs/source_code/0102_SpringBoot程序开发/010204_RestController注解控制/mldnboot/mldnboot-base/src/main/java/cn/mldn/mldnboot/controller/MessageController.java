package cn.mldn.mldnboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController							// 建立控制器，所有路径以Restful形式运行
public class MessageController {
	@RequestMapping("/")				// 访问映射路径
	public String home() {				// 控制器方法
		return "www.mldn.cn";			// 返回信息
	}
}
