import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Test;

public class TestArray {

	static int count = 0;
	
	public static void displayArray(int array[], int sum){
		for(int i = 0; i < array.length; i++){
			System.out.println("The "+ (i+1) + " Score is: " + array[i]);
		}
		System.out.println("Sum of Scores is: " + sum);
	}
	
	public static int sumOfScores(int array[]){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum = sum + array[i];
		}
		return sum;		
	}
	
	public static int[] createArray(int number){
		int array[] = new int[number];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < array.length; i++){
			System.out.println("Enter " + (i+1) +" Subject Score into the array: ");
			array[i] = s.nextInt();
		}
		return array;		
	}
	
	@Test
	public void testingArrays(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of subjects: ");
		int number = s.nextInt();
		int[] array = createArray(number);
		int sum = sumOfScores(array);
		displayArray(array, sum);
		assertEquals(sum, 100);
	}
}
