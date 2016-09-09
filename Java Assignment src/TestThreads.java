import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
public class TestThreads {

	public class Support implements Runnable{
		
		String name1;
		public Support(String name){
			name1 = name;	
		}
		Random r = new Random();
		int time = r.nextInt(999);
		
		public void run() {
			try {
				System.out.printf("\nStarted Thread name: %s", name1);
				System.out.println("\nTime is: "+ time);
				Thread.sleep(time);
				System.out.printf("\nName of the Thread is: %s and Waited for: %d", name1, time);
			} catch (Exception e) {}
		}
	}
	@Test
	public void testingThreads(){
		Thread t1 = new Thread(new Support("one"));
		Thread t2 = new Thread(new Support("two"));
		
		t1.start();
		t2.start();
		assertEquals(t1.isAlive(), true);
		assertEquals(t2.isAlive(), true);
	}
}
