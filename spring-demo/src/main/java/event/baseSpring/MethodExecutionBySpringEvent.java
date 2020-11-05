package event.baseSpring;

import event.baseJavaSE.MethodExecutionEvent.MethodExecutionEventStatus;
import org.springframework.context.ApplicationEvent;

/**
 * @Author: yichuan
 * @Date: 2020/11/5 7:24 下午
 * @Description:
 */
public class MethodExecutionBySpringEvent extends ApplicationEvent {
	private static final long serialVersionUID = -4404290294941686184L;


	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public MethodExecutionBySpringEvent(Object source) {
		super(source);
	}


	private String methodName;
	private MethodExecutionEventStatus methodExecutionEventStatus;

	public MethodExecutionBySpringEvent(Object source, String methodName, MethodExecutionEventStatus status) {
		super(source);
		this.methodName = methodName;
		this.methodExecutionEventStatus = status;
	}


	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public MethodExecutionEventStatus getMethodExecutionEventStatus() {
		return methodExecutionEventStatus;
	}

	public void setMethodExecutionEventStatus(MethodExecutionEventStatus methodExecutionEventStatus) {
		this.methodExecutionEventStatus = methodExecutionEventStatus;
	}
}
