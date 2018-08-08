package mode.chain.servlet;

public class CaseFilter implements Filter {

	public void doFilter(Request request, Response response, FilterChain chain) {
		System.out.println("CaseFilter process start...");
		request.reqMess = request.reqMess.toUpperCase();
		System.out.println("CaseFilter process end...");
		chain.doFilter(request, response, chain);
		response.resMess += "caseFilter ";
	}
}
