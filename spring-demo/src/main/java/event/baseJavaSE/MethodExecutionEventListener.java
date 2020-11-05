package event.baseJavaSE;


import java.util.EventListener;

/**
 * @Author: yichuan
 * @Date: 2020/11/5 3:25 下午
 * @Description: 针对自定义时间的监听器接口
 */
public interface MethodExecutionEventListener extends EventListener {

	/**
	 * 处理方法开始执行时发布的MethodExecutionEvent事件
	 *
	 * @param evt
	 */
	void onMethodBegin(MethodExecutionEvent evt);


	/**
	 * 处理方法执行结束时发布的MethodExecutionEvent事件
	 *
	 * @param evt
	 */
	void onMethodEnd(MethodExecutionEvent evt);

}
