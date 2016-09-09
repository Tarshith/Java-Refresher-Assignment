import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestCollections {

	public boolean checkList(Collection<String> office1, Collection<String> office2) {
		Iterator<String> it = office1.iterator();
		while (it.hasNext()) {
			if (office2.contains(it.next())) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Test
	public void testingCollections() {		
		List<String> office1= new ArrayList<String>();
		List<String> office2 = new ArrayList<String>();
		office1.add("1234");
		office1.add("3456");
		office2.add("2345");
		office2.add("4567");
		assertEquals(true, checkList(office1,office2));	
	}
}
