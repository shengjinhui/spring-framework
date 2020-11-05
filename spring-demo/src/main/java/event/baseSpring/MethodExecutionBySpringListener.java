package event.baseSpring;


import event.baseJavaSE.MethodExecutionEvent.MethodExecutionEventStatus;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author: yichuan
 * @Date: 2020/11/5 7:27 下午
 * @Description:
 */
public class MethodExecutionBySpringListener implements ApplicationListener<MethodExecutionBySpringEvent> {

	@Override
	public void onApplicationEvent(MethodExecutionBySpringEvent event) {
		MethodExecutionEventStatus status = event.getMethodExecutionEventStatus();
		if (status.equals(MethodExecutionEventStatus.BEGIN)) {
			System.out.println("监听器1: 方法开始执行啦,现在开始做准备工作.");
		} else {
			System.out.println("监听器1: 方法执行结束啦,现在做收尾工作.");

		}
	}
}
