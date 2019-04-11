package behaviorTypePatterns.VisitorPattern;

public interface ComputerPart {
	
	public void accept(ComputerPartVisitor computerPartVisitor); 

}
