package behaviorTypePatterns.ChainOfResponsibilityPattern;
/*
 * 责任链模式
*/
public class MainApp {
	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}
	public static void main(String[] args) {
		AbstractLogger loggerChain=getChainOfLoggers();
		loggerChain.logMessage(AbstractLogger.DEBUG, "this is a debug info");
		loggerChain.logMessage(AbstractLogger.INFO,"this is info");
		loggerChain.logMessage(AbstractLogger.ERROR, "this is error info");
	}

}
