package cn.mldn.mldnrabbitmq.spring.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
// 在Spring可以整合所有的消息系统，但是考虑到操作的标准化问题，几乎都会提供有一个MessageListener接口
public class MessageConsumer implements MessageListener {

	@Override
	public void onMessage(Message msg) {
		System.out.println("【消费者接收消息】" + new String(msg.getBody())); 
	}

}
