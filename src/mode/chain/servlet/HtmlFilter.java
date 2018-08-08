package mode.chain.servlet;

public class HtmlFilter implements Filter {

	public void doFilter(Request request, Response response, FilterChain chain) {
		System.out.println("HtmlFilter process start...");
		request.reqMess = request.reqMess.replaceAll("<", "[").replaceAll(">", "]");
		System.out.println("HtmlFilter process end...");
		chain.doFilter(request, response, chain);
		response.resMess += " HtmlFilter ";
	}
}
