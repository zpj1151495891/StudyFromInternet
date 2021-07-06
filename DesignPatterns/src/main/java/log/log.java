package log;

import org.apache.log4j.Logger;

public class log {
	private static Logger Log=Logger.getLogger(log.class);
	public static void main(String[] args) {
		Log.info("-----info log");
		Log.error("----error log-------------------------------------------------------loflooglogsdijfbsjdb计算办法就是比较 ");
		Log.warn("------warn log");
		Log.debug("-----debug log");
	}
	

}
