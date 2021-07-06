package behaviorTypePatterns.MediatorPattern;

public class MainApp {
	
	public static void main(String[] args) {
		User robert=new User("Robert");
		User john=new User("John");
		robert.sendMessage("Hi! John"); john.sendMessage("hello ! Robert");
	}
}
