package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {
	jUnitFunctions t = new jUnitFunctions();
	@Test
	public void test() {
		assertEquals( "Regular integer should work", t.addNumbers(4,5),9);
	}

}
