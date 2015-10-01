package br.pucrs.alpro3lm.recursividade;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

	@Test
	public void testSumZero() {
		int expected = 0;
		int actual = Math.sum(0);
		assertEquals(expected, actual);
	}

	@Test
	public void testSumOne() {
		int expected = 1;
		int actual = Math.sum(1);
		assertEquals(expected, actual);
	}	
	
	@Test
	public void testSumTwo() {
		int expected = 3;
		int actual = Math.sum(2);
		assertEquals(expected, actual);
	}	
}
