package be.joeri.tdd;

import static org.assertj.core.api.Assertions.fail;

import org.junit.Test;

public class FailingTest {
	@Test
	public void testThatFails(){
		fail("This test is failing");
	}
}
