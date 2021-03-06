package com.sap.junit.exceptions_testing;

import static org.junit.Assert.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionsThrowerTest {
	
	private ExceptionsThrower et = new ExceptionsThrower();

	@Test(expected = IndexOutOfBoundsException.class)
	public void simple() {
		et.throwIndexOutOfBoundsException();
	}

	@Test
	public void testExceptionMessage() {
		try {
			et.throwIndexOutOfBoundsException();
			fail("Expected an IndexOutOfBoundsException to be thrown");
		} catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
			//System.out.println(anIndexOutOfBoundsException.getMessage());
			assertThat(anIndexOutOfBoundsException.getMessage(), is("Index: 0, Size: 0"));
		}
	}

}
