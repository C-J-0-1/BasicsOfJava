import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.time.LocalTime;

class Threads implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName() + " is running.");
	}
}

class Scheduler{
	public static void main(String args[]){
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(10);
		
		Thread t1 = new Thread(new Threads());
		Thread t2 = new Thread(new Threads());
		Thread t3 = new Thread(new Threads());
		Thread t4 = new Thread(new Threads());
		Thread t5 = new Thread(new Threads());
		
		scheduler.scheduleAtFixedRate(t1, 1, 1, TimeUnit.SECONDS);
		scheduler.scheduleAtFixedRate(t2, 2, 2, TimeUnit.SECONDS);
		scheduler.scheduleAtFixedRate(t3, 3, 3, TimeUnit.SECONDS);
		scheduler.scheduleAtFixedRate(t4, 4, 4, TimeUnit.SECONDS);
		scheduler.scheduleAtFixedRate(t5, 5, 5, TimeUnit.SECONDS);
		
		long start = LocalTime.now().getSecond();
		
		while(true){
			long end = LocalTime.now().getSecond();
			if((end - start) > 10){
				scheduler.shutdown(); // will shutdown in 10 seconds
				break;
			}
		}
	}
}