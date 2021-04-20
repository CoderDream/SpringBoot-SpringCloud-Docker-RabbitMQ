package cn.mldn.mldncloud.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.mldncloud.StartOAuthServerApplication8701;
import cn.mldn.mldncloud.service.IClientService;
import cn.mldn.mldncloud.service.IMemberService;

@SpringBootTest(classes = StartOAuthServerApplication8701.class)	// 定义要测试的SpringBoot类
@RunWith(SpringJUnit4ClassRunner.class)			// 使用Junit进行测试
@WebAppConfiguration								// 进行Web应用配置
public class TestClientService {
	@Autowired
	private IClientService clientService ;
	@Autowired
	private IMemberService memberService ;
	@Test
	public void testGet() {
		System.out.println(this.clientService.get("cadmin"));
	}
	@Test
	public void testMemberGet() {
		System.out.println(this.memberService.get("mldnjava"));
	}
}
