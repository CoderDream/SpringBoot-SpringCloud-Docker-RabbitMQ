package cn.mldn.mldnrabbitmq.spring.consumer;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbitmqConsumer {
	@Test
	public void testConsumer() throws Exception {
		TimeUnit.DAYS.sleep(Long.MAX_VALUE); 
	}
}
