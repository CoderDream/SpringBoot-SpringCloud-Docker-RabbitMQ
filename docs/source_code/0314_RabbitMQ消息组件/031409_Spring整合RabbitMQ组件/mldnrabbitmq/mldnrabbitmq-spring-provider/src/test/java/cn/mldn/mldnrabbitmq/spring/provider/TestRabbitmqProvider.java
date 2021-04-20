package cn.mldn.mldnrabbitmq.spring.provider;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.mldnrabbitmq.spring.provider.service.IMessageService;

@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbitmqProvider {
	@Resource
	private IMessageService messageService;
	@Test
	public void testSend() {
		this.messageService.send("www.mldn.cn");
	}
}
