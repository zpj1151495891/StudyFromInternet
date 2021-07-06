package constructTypePatterns.ProxyPattern;

public class MainApp {
	
	public static void main(String[] args) {
		Image image=new ProxyImage("test_10.jpg");
		image.display();
		System.out.println("");
		image.display();
	}
}
