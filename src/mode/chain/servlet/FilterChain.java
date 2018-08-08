package mode.chain.servlet;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

	private List<Filter> filterList = new ArrayList<Filter>();

	private int index = 0;

	public void addFilter(Filter filter) {
		this.filterList.add(filter);
	}

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		if (index < filterList.size()) {
			Filter filter = filterList.get(index);
			index++;
			filter.doFilter(request, response, chain);
		}

	}

}
