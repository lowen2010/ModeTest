package mode.chain.netty.request;

import mode.chain.netty.aware.WorkAware;

public class WorkRequest extends Request implements WorkAware{

	public WorkRequest(String reqMess) {
		super(reqMess);
	}

}
