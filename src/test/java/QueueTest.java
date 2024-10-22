import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

	Queue<String> x;
	
	String val1 = "ab";
	String val2;
	
	@BeforeEach
	void setUp() throws Exception {
		x = new Queue<String>();
		val1 = "a";
		val2 = "ab";
	}
	
	@Test
	void pushTest() {
		x.push(val1);
		assertFalse(x.isEmpty(), "Should not be empty");
		x.push(val2);
	
		assertEquals(x.pop(), val1);
	}
	
	@Test
	void popTest() {
		assertThrows(QueueUnderFlowException.class,
				()->{
			x.pop();
			});
		x.push(val1);
		assertEquals(x.pop(), val1);
		x.push(val1);
		x.push(val2);
		assertEquals(x.pop(), val1);
		assertEquals(x.pop(), val2);
		assertTrue(x.isEmpty());
		assertThrows(QueueUnderFlowException.class,
				()->{
			x.pop();
			});
		
	}
	
	@Test
	void isEmptyTest() {
		assertTrue(x.isEmpty());
		x.push(val1);
		assertFalse(x.isEmpty());
	}

}
