package mode.chain.netty;

import mode.chain.netty.handler.DefaultHandler;
import mode.chain.netty.handler.NameHandler;
import mode.chain.netty.handler.WorkHandler;
import mode.chain.netty.request.NameRequest;
import mode.chain.netty.request.Request;
import mode.chain.netty.request.WorkRequest;

public class Client {

	public static void main(String[] args) {
		NameHandler nameHandler = new NameHandler();
		WorkHandler workHandler = new WorkHandler();
		DefaultHandler defaultHandler = new DefaultHandler();
		nameHandler.setNext(workHandler);
		workHandler.setNext(defaultHandler);
		
		Request request = new Request("request");
		NameRequest nameRequest = new NameRequest("nameRequest");
		WorkRequest workRequest = new WorkRequest("workRequest");
		
		System.out.println("==============================");
		nameHandler.hande(nameRequest);
		System.out.println("==============================");
		nameHandler.hande(workRequest);
		System.out.println("==============================");
		nameHandler.hande(request);
		System.out.println("==============================");
	}

}
