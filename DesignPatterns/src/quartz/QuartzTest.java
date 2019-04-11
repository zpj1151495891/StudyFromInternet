package quartz;

import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzTest {
	
	public static void main(String[]args) {
		try {
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
			scheduler.start();
			System.out.println("开始");
			Thread.sleep(10000);
			scheduler.shutdown();
			System.out.println("结束");
			throw new RuntimeException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
 