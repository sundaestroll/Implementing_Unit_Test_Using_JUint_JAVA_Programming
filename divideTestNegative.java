package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTestNegative {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(50,20);
		assertEquals(25,output);
	}

}
