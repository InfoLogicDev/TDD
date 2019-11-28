package be.joeri.tdd;

import static org.assertj.core.api.Assertions.fail;

import org.junit.Ignore;
import org.junit.Test;

public class TestFailing {
	@Ignore
	@Test
	public void testThatFails(){
		fail("This test is failing");
	}
}
