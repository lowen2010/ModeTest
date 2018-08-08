package mode.chain.netty.handler;

import mode.chain.netty.aware.NameAware;
import mode.chain.netty.request.Request;

public class NameHandler extends Handler {

	@Override
	public void hande(Request request) {
		if (request instanceof NameAware) {
			System.out.println("NameHandler 处理请求:" + request.reqMess);
		} else {
			System.out.println("NameHandler 放过请求:" + request.reqMess);
			Handler next = this.getNext();
			if (null != next) {
				next.hande(request);
			} else {
				System.out.println("处理链结束");
			}
		}
	}
}
