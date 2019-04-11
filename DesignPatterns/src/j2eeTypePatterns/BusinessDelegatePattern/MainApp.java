package j2eeTypePatterns.BusinessDelegatePattern;
/*
 * 业务代表模式
*/
public class MainApp {
	
	public static void main(String[]args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");
		Client client = new Client(businessDelegate);
		client.doTask();
		
		businessDelegate.setServiceType("JMS");
		client.doTask();
	}
}
