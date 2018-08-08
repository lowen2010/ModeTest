package mode.chain.netty.handler;

import mode.chain.netty.aware.WorkAware;
import mode.chain.netty.request.Request;

public class WorkHandler extends Handler {

	@Override
	public void hande(Request request) {
		if (request instanceof WorkAware) {
			System.out.println("WorkHandler 处理请求:" + request.reqMess);
		} else {
			System.out.println("WorkHandler 放过请求:" + request.reqMess);
			Handler next = this.getNext();
			if (null != next) {
				next.hande(request);
			} else {
				System.out.println("处理链结束");
			}
		}
	}
}
