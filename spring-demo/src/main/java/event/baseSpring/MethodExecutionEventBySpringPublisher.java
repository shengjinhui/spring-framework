package event.baseSpring;

import event.baseJavaSE.MethodExecutionEvent;
import javafx.application.Application;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: yichuan
 * @Date: 2020/11/5 7:29 下午
 * @Description:
 */
public class MethodExecutionEventBySpringPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher eventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.eventPublisher = applicationEventPublisher;
	}

	public void methodToMonitor() {
		MethodExecutionBySpringEvent beginEvent = new MethodExecutionBySpringEvent(this, "methodToMonitor", MethodExecutionEvent.MethodExecutionEventStatus.BEGIN);
		this.eventPublisher.publishEvent(beginEvent);
		System.out.println("方法执行流程....");
		MethodExecutionBySpringEvent endEvent = new MethodExecutionBySpringEvent(this, "methodToMonitor", MethodExecutionEvent.MethodExecutionEventStatus.END);
		this.eventPublisher.publishEvent(endEvent);
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		MethodExecutionEventBySpringPublisher evtPublisher = (MethodExecutionEventBySpringPublisher) context.getBean("evtPublisher");
		evtPublisher.methodToMonitor();
	}
}
