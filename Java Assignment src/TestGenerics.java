import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class TestGenerics {

	public static <T> boolean test(T a, T b){
		List<T> list = new ArrayList<T>();
		list.add(a);
		list.add(b);
		if(list.get(0).equals(list.get(1))){
			System.out.println("Both are equal");
			return true;
		}
		else {
			System.out.println("Both are NOT equal");
			return false;
		}
	}	
	@Test
	public void testingGenerics(){
		int a = 2;
		double b =  2;
		String c = "Vishnu";
		assertEquals(test(a,b), true);
	}

}
