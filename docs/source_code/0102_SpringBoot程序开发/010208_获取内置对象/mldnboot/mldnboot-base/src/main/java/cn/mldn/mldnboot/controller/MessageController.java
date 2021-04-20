package cn.mldn.mldnboot.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	@GetMapping("/object")
	public Object object(HttpServletRequest request,HttpServletResponse response) {
		Map<String,String> map = new HashMap<String,String>() ;
		map.put("客户端IP地址", request.getRemoteAddr()) ;
		map.put("客户端响应编码", response.getCharacterEncoding()) ;
		map.put("SessionID", request.getSession().getId()) ;
		map.put("项目真实路径", request.getServletContext().getRealPath("/")) ;
		return map ; 					// 以Restful风格返回
	}

	
	
}
