package j2eeTypePatterns.InterceptingFilterPattern;

public class MainApp {
	
	public static void main(String[]args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());
		Client client = new Client();
		client.setFilterManage(filterManager);
		client.sendRequest("HOME");
	}

}
