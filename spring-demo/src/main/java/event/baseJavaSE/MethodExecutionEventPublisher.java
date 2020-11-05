package event.baseJavaSE;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yichuan
 * @Date: 2020/11/5 3:32 下午
 * @Description:
 */
public class MethodExecutionEventPublisher {
	private List<MethodExecutionEventListener> listeners = new ArrayList<>();

	public void methodToMonitor() {
		MethodExecutionEvent event2Publish = new MethodExecutionEvent(this, "methodToMonitor");
		publishEvent(MethodExecutionEvent.MethodExecutionEventStatus.BEGIN, event2Publish);
		System.out.println("方法执行起来了");
		publishEvent(MethodExecutionEvent.MethodExecutionEventStatus.END, event2Publish);
	}

	protected void publishEvent(MethodExecutionEvent.MethodExecutionEventStatus status, MethodExecutionEvent event) {
		ArrayList<MethodExecutionEventListener> copyListeners = new ArrayList<>(listeners);

		for (MethodExecutionEventListener listener : copyListeners) {
			if (MethodExecutionEvent.MethodExecutionEventStatus.BEGIN.equals(status)) {
				listener.onMethodBegin(event);
			} else {
				listener.onMethodEnd(event);
			}
		}
	}

	public void addMethodExecutionEventListener(MethodExecutionEventListener listener) {
		this.listeners.add(listener);
	}

	public void removeListener(MethodExecutionEventListener listener) {
		if (this.listeners.contains(listener)) {
			this.listeners.remove(listener);
		}
	}

	public void removeAllListeners() {
		this.listeners.clear();
	}

	public static void main(String[] args) {
		MethodExecutionEventPublisher eventPublisher = new MethodExecutionEventPublisher();
		eventPublisher.addMethodExecutionEventListener(new SimpleMethodExecutionEventListener());
		eventPublisher.methodToMonitor();
	}
}
