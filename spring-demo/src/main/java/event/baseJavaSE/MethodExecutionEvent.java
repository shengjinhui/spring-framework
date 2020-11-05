package event.baseJavaSE;

import java.util.EventObject;

/**
 * @Author: yichuan
 * @Date: 2020/11/5 3:21 下午
 * @Description: 自定义事件类型
 */
public class MethodExecutionEvent extends EventObject {
	private static final long serialVersionUID = 71960369269303337L;
	private String methodName;


	/**
	 * Constructs a prototypical Event.
	 *
	 * @param source The object on which the Event initially occurred.
	 * @throws IllegalArgumentException if source is null.
	 */
	public MethodExecutionEvent(Object source) {
		super(source);
	}

	public MethodExecutionEvent(Object source, String methodName) {
		super(source);
		this.methodName = methodName;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}


	public enum MethodExecutionEventStatus {
		BEGIN,
		END;
	}
}
