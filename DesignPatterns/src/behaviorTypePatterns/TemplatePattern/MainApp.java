package behaviorTypePatterns.TemplatePattern;

public class MainApp {
	
	public static void main(String[] args) {
		Game game=new Cricket();
		game.play();
		System.out.println();
		game=new Football();
		game.play();
	}

}
