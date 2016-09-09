import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TestStack {
	public int Stack(int n, String numAge) {
		int count = 0;
		Scanner s = new Scanner(System.in);
		Stack<String> stack= new Stack<String>();
		for(int i = 1; i <= n; i++){
			System.out.println("Enter the age of " + i + " Student: ");
			String age = s.next();
			stack.push(age);
		}
		Iterator<String> iter = stack.iterator();
		while(iter.hasNext()){
			String value = iter.next();
			if(value.equals(numAge)) {
				count++;
			}
		}
		System.out.println(numAge + " is Repeated " + count + " times");
		return count;
	}
	@Test
	public void test() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of students ages you want to enter into the database: ");
		int n = s.nextInt();
		System.out.println("Enter the Age you want to check if it is repeated: ");
		String numAge = s.next();
		assertEquals(Stack(n, numAge), 2);
	}

}
