
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import org.junit.Test;

public class TestQueue {
	public boolean QueuesTest(String name) {
			Queue<String> q = new  LinkedList<String>();
			q.add("Tarshith");
			q.add("Vishnu");
			q.add("Teja");
			q.add("Tuttu");
			q.add("Pernapati");
			
			if(q.contains(name)){
				System.out.println("Test Failed, Queue already contains the element, Here is the list of the elements: \n" + q);
				return false;
			}
			else{
				q.add(name);
				System.out.println("Successfully added the element into the Queue! here is the list of Names in the Queue: \n" + q);
				return true;
			}
	}
	@Test
	public void testStack(){
		//Queues queuesObject = new Queues();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of the student: ");
		String name = s.nextLine();
		assertEquals(QueuesTest(name), true);
	}
}