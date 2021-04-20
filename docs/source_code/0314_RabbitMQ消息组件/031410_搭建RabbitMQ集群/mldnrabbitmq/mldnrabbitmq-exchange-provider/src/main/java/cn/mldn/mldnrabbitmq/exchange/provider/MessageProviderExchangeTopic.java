package cn.mldn.mldnrabbitmq.exchange.provider;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

public class MessageProviderExchangeTopic {
	private static final String HOST = "rabbitmq-single"; // 主机名称
	private static final int PORT = 5672; // 发送端口
	private static final String USERNAME = "mldn";
	private static final String PASSWORD = "java";
	private static final String EXCHANGE_NAME = "mldn.exchange.topic"; // 定义exchange名称
	private static final String VHOST = "info"; // 定义一个虚拟主机

	public static void main(String[] args) throws Exception {
		// 如果要进行RabbitmQ连接，则一定需要有一个连接工厂类，通过连接工厂创建出连接
		ConnectionFactory factory = new ConnectionFactory(); // 创建连接工厂
		factory.setHost(HOST); // 连接主机
		factory.setPort(PORT); // 连接端口
		factory.setUsername(USERNAME); // 用户名
		factory.setPassword(PASSWORD); // 密码
		factory.setVirtualHost(VHOST); // 虚拟主机
		// 通过连接工厂可以直接获取一个连接对象 
		Connection connection = factory.newConnection(); // 建立新的连接
		// 如果要进行消息的发送，则一定需要通过连接获取一个Channel
		Channel channel = connection.createChannel();// 创建一个连接通道
		channel.exchangeDeclare(EXCHANGE_NAME, "topic");// 设置exchange类型 
		long start = System.currentTimeMillis(); 
		for (int x = 0; x < 10; x++) {
			String msg = "mldnjava - " + x; // 消息内容
			channel.basicPublish(EXCHANGE_NAME, "mldn-key", MessageProperties.PERSISTENT_TEXT_PLAIN, msg.getBytes());
		}
		long end = System.currentTimeMillis();
		System.err.println("消息发送完成，本次发送所花费的时间为：" + (end - start));
		channel.close();
		connection.close();
	}

}
