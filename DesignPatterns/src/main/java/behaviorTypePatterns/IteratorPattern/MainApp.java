package behaviorTypePatterns.IteratorPattern;

public class MainApp {
	
	public static void main(String[] args) {
		NameRepository namesRepository=new NameRepository();
		Iterator iter=namesRepository.getIterator();
		while(iter.hasNext()) {
			System.out.println("Name:"+iter.next());
		}
	}

}
