package mode.chain.netty.handler;

import mode.chain.netty.request.Request;

public abstract class Handler {
	private Handler next;

	public abstract void hande(Request request);

	public Handler getNext() {
		return next;
	}

	public void setNext(Handler next) {
		this.next = next;
	}

}
