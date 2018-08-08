package mode.chain.netty.request;

import mode.chain.netty.aware.NameAware;

public class NameRequest extends Request implements NameAware{

	public NameRequest(String reqMess) {
		super(reqMess);
	}

}
