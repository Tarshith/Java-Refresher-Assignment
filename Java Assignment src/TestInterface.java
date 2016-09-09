import static org.junit.Assert.*;

import org.junit.Test;

public class TestInterface {

	public interface property {
		int print(int prop);
		int getProperty(int prop);
		int giveProperty(int prop);
	}
	
	public class son implements property{
		@Override	
		public int print(int prop) {
			return prop;				
		}
		@Override
		public int getProperty(int prop) {
			prop--;		
			return prop;
		}
		@Override
		public int giveProperty(int prop) {
			prop++;
			return prop;
		}
	}
	
	public class daughter implements property{
		@Override
		public int print(int prop) {
			return prop;				
		}
		@Override
		public int getProperty(int prop) {
			prop--;		
			return prop;
		}
		@Override
		public int giveProperty(int prop) {
			prop++;
			return prop;
		}
	}
	
	@Test
	public void testingInterface(){
		int totalProperty = 10;
		son son = new son();
		daughter daughter = new daughter();	
		
		int prop = daughter.getProperty(totalProperty);
		System.out.println("Properties remaining: " + prop);
		
		prop = son.giveProperty(prop);
		System.out.println("Properties remaining: " + prop);		
		
		prop = daughter.getProperty(prop);
		System.out.println("Properties remaining: " + prop);
		assertEquals(prop, 9);
	}
}
