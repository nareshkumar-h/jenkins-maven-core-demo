package com.naresh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddition {

	@Test
	public void test() {
		int result = Addition.add(2, 3);
		assertEquals(6, result);
	}

}
