package j2eeTypePatterns.InterceptingFilterPattern;

public class Client {
	FilterManager filterManager;
	
	public void setFilterManage(FilterManager filterManager) {
		this.filterManager = filterManager;
	}
	
	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}
}
