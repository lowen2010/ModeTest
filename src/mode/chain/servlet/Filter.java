package mode.chain.servlet;

public interface Filter {

	public void doFilter(Request request, Response response, FilterChain chain);

}
