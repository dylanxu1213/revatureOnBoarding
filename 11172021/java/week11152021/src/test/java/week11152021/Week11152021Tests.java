package week11152021;


import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.*;

import org.junit.Test;

import week11152021.Week11152021;

public class Week11152021Tests {

	@Test
	public void testSquarePatch() {
		int[][] arr1 = Week11152021.squarePatch(0);
		int[][] arr2 = Week11152021.squarePatch(3);
		int[][] arr3 = Week11152021.squarePatch(5);
		int[][] arr4 = Week11152021.squarePatch(1);
		int[][] arr1Exp = {{}};
		int[][] arr2Exp = {{3,3,3},{3,3,3},{3,3,3}};
		int[][] arr3Exp = {{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5}};
		int[][] arr4Exp = {{1}};
		assertArrayEquals(arr1,arr1Exp);
		assertArrayEquals(arr2,arr2Exp);
		assertArrayEquals(arr3,arr3Exp);
		assertArrayEquals(arr4,arr4Exp);
	}

	@Test
	public void testAscending() {
		assertTrue(Week11152021.ascending("232425"));
		assertFalse(Week11152021.ascending("2324256"));
		assertFalse(Week11152021.ascending("420911"));
		assertTrue(Week11152021.ascending("444445"));
		assertTrue(Week11152021.ascending("133713381339"));
		assertTrue(Week11152021.ascending("9899100101"));
	}
}
