package com.capgemini.test;

import org.junit.Before;
import org.junit.Test;

public class testGenerateInvoice {

	@Before
	public void init() {

	}

	@Test(expected = NullPointerException.class)
	public void testIdNotFound() {

	}

	@Test(expected = NullPointerException.class)
	public void testEmptyOrderDetails() {

	}

	@Test(expected=IllegalArgumentException.class)
	public void testInvalidEntries() {

	}

	@Test
	public void testvalidOrderDetails() {

	}

}
