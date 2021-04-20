package cn.mldn.mldncloud.consumer;	
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine							// 启用Turbine
public class StartTurbineApplication {
	public static void main(String[] args) {
		SpringApplication.run(StartTurbineApplication.class, args);
	}
}
 