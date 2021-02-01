package com.junit.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	calculatorTest target = null;
	
	// Fixtures - environment setup
	
	@Before
	public void setup() {
		target=new calculatorTest();
		System.out.println("-------- Before every Testcase ------");
	}
	
	@After 
	public void teardown() {
		target = null;
		System.out.println("--------- After every Testcase -------");
	}
	
	@Test
	public void test_add() {
		System.out.println("---- Executiong addition Testcase-------");
		int input1=10, input2=78, expectedresult=88;
		int actualresult=target.add(input1, input2);
		
		Assert.assertEquals(expectedresult, actualresult);
		
		input1=1000;
		input2=2000;
		expectedresult=3000;
		actualresult=target.add(input1, input2);
		Assert.assertEquals(expectedresult, actualresult);	
	}
	
	@Test
	public void test_sub() {
		System.out.println("---- Executiong subtraction Testcase-------");
		int input1=98, input2=78, expectedresult=20;
		int actualresult=target.sub(input1, input2);
		
		Assert.assertEquals(expectedresult, actualresult);
		
		input1=2000;
		input2=1000;
		expectedresult=1000;
		actualresult=target.add(input1, input2);
		Assert.assertEquals(expectedresult, actualresult);	
	}
	
	@Test
	public void test_mul() {
		System.out.println("---- Executiong multiplication Testcase-------");
		int input1=10, input2=6, expectedresult=60;
		int actualresult=target.sub(input1, input2);
		
		Assert.assertEquals(expectedresult, actualresult);
		
		input1=25;
		input2=25;
		expectedresult=625;
		actualresult=target.add(input1, input2);
		Assert.assertEquals(expectedresult, actualresult);	
	}
	
	@Test
	public void test_div() {
		System.out.println("---- Executiong division Testcase-------");
		int input1=100, input2=10, expectedresult=10;
		int actualresult=target.sub(input1, input2);
		
		Assert.assertEquals(expectedresult, actualresult);
		
		input1=2000;
		input2=1000;
		expectedresult=1;
		actualresult=target.add(input1, input2);
		Assert.assertEquals(expectedresult, actualresult);	
	}

}
