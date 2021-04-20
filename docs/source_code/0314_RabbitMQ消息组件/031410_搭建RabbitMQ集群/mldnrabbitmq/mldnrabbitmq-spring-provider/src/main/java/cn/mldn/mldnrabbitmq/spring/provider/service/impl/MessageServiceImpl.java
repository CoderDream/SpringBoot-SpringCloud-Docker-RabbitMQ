package cn.mldn.mldnrabbitmq.spring.provider.service.impl;

import javax.annotation.Resource;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import cn.mldn.mldnrabbitmq.spring.provider.service.IMessageService;
@Service
public class MessageServiceImpl implements IMessageService {
	private static final String ROUTING_KEY = "mldn-key" ;
	@Resource
	private AmqpTemplate amqpTemplate ; // 注入消息组件工具类
	@Override
	public void send(String msg) {
		this.amqpTemplate.convertAndSend(ROUTING_KEY, msg); 
	}

}
