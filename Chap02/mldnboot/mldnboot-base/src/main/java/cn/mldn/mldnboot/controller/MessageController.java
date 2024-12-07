package cn.mldn.mldnboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller                                // 建立控制器
public class MessageController {
    @RequestMapping("/")                // 访问映射路径
    @ResponseBody                        // rest返回形式
    public String home() {                // 控制器方法
        return "www.mldn.cn";            // 返回信息
    }

    @GetMapping("/echo")                // 只支持GET请求模式
    @ResponseBody                        // rest返回形式
    public String echo(String msg) {    // 接收msg参数
        return "【ECHO】" + msg;        // 信息处理后返回
    }

    @GetMapping("/echo2/{message}")                // 只支持GET请求模式
    @ResponseBody                        // rest返回形式
    public String echo2(@PathVariable("message") String msg) {    // 接收msg参数
        return "【ECHO2】" + msg;        // 信息处理后返回
    }

    @GetMapping("/object")
    @ResponseBody                        // rest返回形式
    public Object object(HttpServletRequest request, HttpServletResponse response) {
        Map<String, String> map = new HashMap<>();
        map.put("客户端IP地址", request.getRemoteAddr());
        map.put("客户端响应编码", response.getCharacterEncoding());
        map.put("SessionID", request.getSession().getId());
        map.put("项目真实路径", request.getServletContext().getRealPath("/"));
        return map;                    // 以Restful风格返回
    }

    @GetMapping("/object2")
    @ResponseBody                        // rest返回形式
    public Object object2() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        Map<String, String> map = new HashMap<>();
        map.put("客户端响应编码", response.getCharacterEncoding());
        map.put("客户端IP地址", request.getRemoteAddr());
        map.put("SessionID", request.getSession().getId());
        map.put("项目真实路径", request.getServletContext().getRealPath("/"));
        return map;                    // 以Restful风格返回
    }
}
