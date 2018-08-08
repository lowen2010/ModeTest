package mode.chain.servlet;

public class Client {

	public static void main(String[] args) {
		FilterChain chain = new FilterChain();
		Filter htmlFilter = new HtmlFilter();
		Filter caseFilter = new CaseFilter();
		chain.addFilter(htmlFilter);
		chain.addFilter(caseFilter);
		String msg = "hi lowen,<script> hi <script>";
		Request request = new Request(msg);
		Response response = new Response("res:");
		chain.doFilter(request, response, chain);
		System.out.println("请求消息：" + request.reqMess);
		System.out.println("响应消息：" + response.resMess);
	}

}
