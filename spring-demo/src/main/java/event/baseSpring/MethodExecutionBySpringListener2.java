package event.baseSpring;

import event.baseJavaSE.MethodExecutionEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author: yichuan
 * @Date: 2020/11/5 7:46 下午
 * @Description:
 */
public class MethodExecutionBySpringListener2 implements ApplicationListener<MethodExecutionBySpringEvent> {
	@Override
	public void onApplicationEvent(MethodExecutionBySpringEvent event) {
		MethodExecutionEvent.MethodExecutionEventStatus status = event.getMethodExecutionEventStatus();
		if (status.equals(MethodExecutionEvent.MethodExecutionEventStatus.BEGIN)) {
			System.out.println("监听器2: 方法开始执行啦,现在开始做准备工作.");
		} else {
			System.out.println("监听器2: 方法执行结束啦,现在做收尾工作.");

		}
	}
}
