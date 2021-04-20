package cn.mldn.mldnrabbitmq.consumer.a;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;

public class MessageConsumerA {
	private static final String HOST = "rabbitmq-single"; // 主机名称
	private static final int PORT = 5672; // 发送端口
	private static final String USERNAME = "mldn"; // 用户名
	private static final String PASSWORD = "java"; // 密码
	private static final String QUEUE_NAME = "mldn.msg.queue"; // 建立一个队列名称

	public static void main(String[] args) throws Exception {
		// 如果要进行RabbitmQ连接，则一定需要有一个连接工厂类，通过连接工厂创建出连接
		ConnectionFactory factory = new ConnectionFactory(); // 创建连接工厂
		factory.setHost(HOST); // 连接主机
		factory.setPort(PORT); // 连接端口
		factory.setUsername(USERNAME); // 用户名
		factory.setPassword(PASSWORD); // 密码
		// 通过连接工厂可以直接获取一个连接对象
		Connection connection = factory.newConnection(); // 建立新的连接
		// 如果要进行消息的发送，则一定需要通过连接获取一个Channel
		Channel channel = connection.createChannel();// 创建一个连接通道
		channel.queueDeclare(QUEUE_NAME, true, false, true, null);
		Consumer consumer = new DefaultConsumer(channel) {
			// 进行消息的处理操作
			public void handleDelivery(String consumerTag, com.rabbitmq.client.Envelope envelope,
					com.rabbitmq.client.AMQP.BasicProperties properties, byte[] body) throws java.io.IOException {
				String message = new String(body); // 将字节数组变为字符串
				System.err.println("【消息消费者-A】" + message);
			};
		};
		channel.basicConsume(QUEUE_NAME, consumer); // 设置消息消费者
	}
}
