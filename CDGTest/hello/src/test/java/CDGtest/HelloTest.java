package CDGtest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import CDG.Hello;

/**
 * 
 * @author Train_SRS
 *
 */

public class HelloTest {
	String x ; 
	@Test
	public void HelloShouldhelloworld() {
		Hello hello = new Hello();
		assertEquals("Hello World !!", hello.say());

	}
}
