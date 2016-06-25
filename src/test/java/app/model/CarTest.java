package app.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void sanityTest() {
		assertTrue(true);
	}
	
	@Test
	public void instanceIsCreated() {
		Car c = new Car("blue");
		assertNotNull(c);
	}
	
	@Test
	public void colorSetWhenCreated() {
		Car c = new Car("blue");
		assertEquals("blue", c.getColor());
	}

}
