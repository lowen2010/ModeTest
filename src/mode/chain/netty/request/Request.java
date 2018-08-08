package mode.chain.netty.request;

import mode.chain.netty.aware.Aware;

public class Request implements Aware{

	public String reqMess;

	public Request(String reqMess) {
		this.reqMess = reqMess;
	}

}
