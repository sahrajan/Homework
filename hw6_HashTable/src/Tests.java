
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Random;
import org.junit.jupiter.api.Test;

public class Tests {
	
		@Test()
		public void testIsEmpty() {
			LinearProbingHashTable<String, Integer> h = new LinearProbingHashTable<String, Integer>();
			//assertFalse(h.isEmpty());
			//h = array(10);
			//assertTrue(h.isEmpty());
			assertTrue(h.isEmpty());
		}
						
		@Test()
		public void testContainsKey() {
			LinearProbingHashTable<String, Integer> h = new LinearProbingHashTable<String, Integer>();
			assertFalse(h.containsKey(("raj")));
			int arg0 = 13;
			assertFalse(h.containsKey(arg0));
		}
		
		@Test()
		public void testContainsValue() {
			LinearProbingHashTable<String, Integer> h = new LinearProbingHashTable<String, Integer>();
			assertFalse(h.containsKey("raj"));
			int arg0 = 13;
			assertFalse(h.containsKey(arg0));
		}	
}