package com.coderdream.controller;

import com.coderdream.vo.Member;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class ThymeleafController {

    @GetMapping("/view1")
    public String view1(String mid, Model model) {
        model.addAttribute("url", "www.mldn.cn");    // request属性传递包装
        model.addAttribute("mid", mid);            // request属性传递包装
        return "message/01_message_show";                // 此处只返回一个路径， 该路径没有设置后缀，后缀默认是*.html
    }

    /**
     * 3.2 使用html标签
     *
     * @param mid
     * @param model
     * @return
     */
    @GetMapping("/view2")
    public String view2(String mid, Model model) {
        model.addAttribute("url",
            "<h1><span style='color:red'>www.mldn.cn</span></h1>");// request属性传递包装
        model.addAttribute("mid", mid);            // request属性传递包装
        return "message/02_message_show";                // 此处只返回一个路径， 该路径没有设置后缀，后缀默认是*.html
    }

    /**
     * 3.4 读取资源文件
     *
     * @return 返回视图路径
     */
    @GetMapping("/view4")
    public String view4(String mid, Model model) {
        return "message/04_message_value";                // 此处只返回一个路径， 该路径没有设置后缀，后缀默认是*.html
    }

    /**
     * 3.5 路径处理
     *
     * @return 返回视图路径
     */
    @GetMapping("/view5")
    public String path() {
        return "message/05_message_path";
    }

    /**
     * 3.6 获取内置对象
     *
     * @return 返回视图路径
     */
    @GetMapping("/demo06")
    public String attr() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
            .getRequest();            // 获取HttpServletRequest内置对象
        request.setAttribute("requestMessage", "request - www.mldn.cn");
        request.getSession()
            .setAttribute("sessionMessage", "session - www.mldnjava.cn");
        request.getServletContext().setAttribute("applicationMessage",
            "application - www.jixianit.com");
        return "message/06_message_attr";
    }

    /**
     * 3.7 对象输出
     *
     * @return 返回视图路径
     */
    @GetMapping("/demo07")
    public String member(Model model) throws Exception {
        Member vo = new Member();
        vo.setMid("mldnjava");
        vo.setName("李兴华");
        vo.setSalary(3500.00);
        vo.setAge(18);
        vo.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1998-09-15"));
        model.addAttribute("member", vo);        // 传递页面属性
        return "message/07_message_member";
    }

    /**
     * 3.8 页面逻辑处理
     *
     * @return 返回视图路径
     */
    @GetMapping("/demo08")
    public String member2(Model model) throws Exception {
        Member vo = new Member();
        vo.setMid("mldnjava");
        vo.setName("李兴华");
        vo.setSalary(3500.00);
        vo.setAge(18);
        vo.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1998-09-15"));
        model.addAttribute("member", vo);        // 传递页面属性
        return "message/08_message_member";
    }

    /**
     * 3.9 输出List
     *
     * @return 返回视图路径
     */
    @GetMapping("/demo09")
    public String list(Model model) throws Exception {
        List<Member> allMembers = new ArrayList<Member>();
        for (int x = 0; x < 5; x++) {
            Member vo = new Member();
            vo.setMid("mldnjava - " + x);
            vo.setName("李兴华 - " + x);
            vo.setSalary(3500.00);
            vo.setAge(16 + x);
            vo.setBirthday(
                new SimpleDateFormat("yyyy-MM-dd").parse("1998-09-15"));
            allMembers.add(vo);
        }
        model.addAttribute("allMembers", allMembers);        // 传递页面属性
        return "message/09_message_list";
    }

    /**
     * 3.10 输出Map
     *
     * @param model
     * @return
     * @throws Exception
     */
    @GetMapping("/demo10")
    public String map(Model model) throws Exception {
//        Map<String, Member> allMembers = new HashMap<String, Member>();
        Map<String, Member> allMembers = new LinkedHashMap<>();
        for (int x = 0; x < 5; x++) {
            Member vo = new Member();
            vo.setMid("mldnjava - " + x);
            vo.setName("李兴华 - " + x);
            vo.setSalary(3500.00);
            vo.setAge(16 + x);
            vo.setBirthday(
                new SimpleDateFormat("yyyy-MM-dd").parse("1998-09-15"));
            allMembers.put("mldn-" + x, vo);
        }
        model.addAttribute("allMembers", allMembers);        // 传递页面属性
        return "message/10_message_map";
    }

    /**
     * 3.11 页面包含
     *
     * @param model model
     * @return 返回视图路径
     */
    @GetMapping("/demo11")
    public String include(Model model) throws Exception {
        return "message/11_message_include";
    }

    /**
     * 3.12 输出Set
     *
     * @param model model
     * @return 返回视图路径
     */
    @GetMapping("/demo12")
    public String set(Model model) throws Exception {
        Set<String> all = new HashSet<String>();
        all.addAll(Arrays.asList("mldn", "mldnjava", "jixianit"));
        model.addAttribute("allInfos", all);        // 传递页面属性
        return "message/12_message_set";
    }

    /**
     * 3.13 输出字符串
     *
     * @param model model
     * @return 返回视图路径
     * @throws Exception Exception
     */
    @GetMapping("/demo13")
    public String string(Model model) throws Exception {
        model.addAttribute("info", "www.mldn.cn");
        return "message/13_message_string";
    }

    /**
     * 3.14 输出日期
     *
     * @param model model
     * @return 返回视图路径
     * @throws Exception Exception
     */
    @GetMapping("/demo14")
    public String date(Model model) throws Exception {
        model.addAttribute("mydate",
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(
                "2008-08-08 18:08:08"));
        return "message/14_message_date";
    }
}
