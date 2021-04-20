package cn.mldn.mldnrabbitmq.queue.provider;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

public class MessageProvider {
	private static final String HOST = "rabbitmq-single"; 		// 主机名称
	private static final int PORT = 5672; 						// 发送端口
	private static final String USERNAME = "mldn";				// 用户名
	private static final String PASSWORD = "java";				// 密码
	private static final String EXCHANGE_NAME = "mldn.exchange.fanout"; // 定义exchange名称
	private static final String VHOST = "info"; 				// 定义一个虚拟主机
	public static void main(String[] args) throws Exception {
		// 如果要进行RabbitmQ连接，则一定需要有一个连接工厂类，通过连接工厂创建出连接
		ConnectionFactory factory = new ConnectionFactory(); 	// 创建连接工厂
		factory.setHost(HOST); 									// 连接主机
		factory.setPort(PORT); 									// 连接端口
		factory.setUsername(USERNAME); 							// 用户名
		factory.setPassword(PASSWORD); 							// 密码
		factory.setVirtualHost(VHOST); 							// 虚拟主机
		// 通过连接工厂可以直接获取一个连接对象
		Connection connection = factory.newConnection(); 		// 建立新的连接
		// 如果要进行消息的发送，则一定需要通过连接获取一个Channel
		Channel channel = connection.createChannel();			// 创建连接通道
		channel.exchangeDeclare(EXCHANGE_NAME, "fanout");		// 设置exchange类型
		for (int x = 0; x < 10; x++) {
			String msg = "mldnjava - " + x; 					// 消息内容
			channel.basicPublish(EXCHANGE_NAME, "", 
					MessageProperties.PERSISTENT_TEXT_PLAIN, msg.getBytes());
		}
		channel.close();										// 关闭通道
		connection.close();										// 关闭连接
	}
}
