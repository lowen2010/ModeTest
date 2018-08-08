package mode.chain.netty.handler;

import mode.chain.netty.request.Request;

public class DefaultHandler extends Handler {

	@Override
	public void hande(Request request) {
		System.out.println("DefaultHandler 处理请求：" + request.reqMess);
	}
}
