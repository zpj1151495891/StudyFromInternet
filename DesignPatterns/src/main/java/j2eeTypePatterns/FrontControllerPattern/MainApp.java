package j2eeTypePatterns.FrontControllerPattern;

public class MainApp {
	
	public static void main(String[]args) {
		FrontController frontController=new FrontController();
		frontController.dispatcherRequest("Home");
		frontController.dispatcherRequest("STUDENT");
	}

}
