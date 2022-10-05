package cn.mldn.mldnboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller                                                        // 控制器注解
@EnableAutoConfiguration                                        // 启用自动配置
public class SampleController {
    @RequestMapping("/")                                        // 访问映射路径
    @ResponseBody                                                // rest返回形式
    public String home() {                                        // 控制器方法
        return "www.mldn.cn";                                    // 返回信息
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);    // 启动SpringBoot程序
    }
}
