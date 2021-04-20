package cn.mldn.mldnrabbitmq.exchange.provider;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

public class MessageProvider {
	private static final String HOST = "rabbitmq-single"; // 主机名称
	private static final int PORT = 5672; // 发送端口
	private static final String USERNAME = "mldn";
	private static final String PASSWORD = "java";
	private static final String QUEUE_NAME = "mldn.msg.queue"; // 建立一个队列名称
	private static final String VHOST = "info" ; // 定义一个虚拟主机

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
		// 随后需要对通道之中使用的队列进行配置，需要明确的知道队列的信息，在创建一个队列时有如下参数
		// 第一个参数（String queue）：队列名称（这个队列可能存在也可能不存在）
		// 第二个参数（boolean durable）：是否为持久存储（未消费不删除）
		// 第三个参数（boolean exclusive）：是否为专用的队列信息，设置为false
		// 第四个参数（boolean autoDelete）：是否允许为自动删除，消费之后删除
		// 第五个参数（Map<String, Object> arguments）：队列处理参数，一般可以设置为null
		channel.queueDeclare(QUEUE_NAME, true, false, true, null);
		long start = System.currentTimeMillis();
		for (int x = 0; x < 10; x++) {
			String msg = "mldnjava - " + x; // 消息内容
			channel.basicPublish("", QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN, msg.getBytes());
		}
		long end = System.currentTimeMillis();
		System.err.println("消息发送完成，本次发送所花费的时间为：" + (end - start));
		channel.close();
		connection.close();
	}

}
