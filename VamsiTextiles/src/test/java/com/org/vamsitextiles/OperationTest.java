package com.org.vamsitextiles;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest {

	@Test
	public void test() {
		Operation op = new Operation();
		
		assertEquals(12, op.add(6, 6));
	}

}
