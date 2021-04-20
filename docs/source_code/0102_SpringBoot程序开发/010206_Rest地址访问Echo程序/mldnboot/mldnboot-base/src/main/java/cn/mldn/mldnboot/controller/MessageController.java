package cn.mldn.mldnboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController							// 建立控制器，所有路径以Restful形式运行
public class MessageController {
	@RequestMapping("/")				// 访问映射路径
	public String home() {				// 控制器方法
		return "www.mldn.cn";			// 返回信息
	}
	@GetMapping("/echo/{message}")								// 只支持GET请求模式
	public String echo(@PathVariable("message") String msg) {	// 接收msg参数
		return "【ECHO】" + msg ;								// 信息处理后返回
	}

}
