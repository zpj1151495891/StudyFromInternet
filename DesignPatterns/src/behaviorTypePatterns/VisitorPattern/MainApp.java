package behaviorTypePatterns.VisitorPattern;

public class MainApp {
	
	public static void main(String[]args) {
		ComputerPart computer =new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
