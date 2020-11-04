import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MyService;

/**
 * @Author: yichuan
 * @Date: 2020/11/4 10:59 上午
 * @Description:
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		MyService myService = applicationContext.getBean("myService", MyService.class);
		myService.hi();

	}
}
