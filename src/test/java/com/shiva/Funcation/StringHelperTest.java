package com.shiva.Funcation;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void test() {
		
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("CD"));
		assertEquals("CDA", helper.truncateAInFirst2Positions("ACDA"));
		//Expected and Actual 
	}

}
