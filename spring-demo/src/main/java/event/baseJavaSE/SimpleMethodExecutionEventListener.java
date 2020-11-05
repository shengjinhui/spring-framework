package event.baseJavaSE;

/**
 * @Author: yichuan
 * @Date: 2020/11/5 3:30 下午
 * @Description:
 */
public class SimpleMethodExecutionEventListener implements MethodExecutionEventListener {


	@Override
	public void onMethodBegin(MethodExecutionEvent evt) {
		String methodName = evt.getMethodName();
		System.out.println("start to execute the method[" + methodName + "]");
	}

	@Override
	public void onMethodEnd(MethodExecutionEvent evt) {
		String methodName = evt.getMethodName();
		System.out.println("finished to execute the method[" + methodName + "]");
	}
}
