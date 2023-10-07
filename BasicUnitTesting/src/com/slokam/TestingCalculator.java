package com.slokam;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class TestingCalculator {
	
	
	@Test
	public void test1()
	{
		Calculator calculator = new Calculator();
	int rs=	calculator.calc(10,15, "ADD");
	Assert.assertEquals(25, rs);
	
	}
	
	@Test
	
	public void test2()
	{
		Calculator calculator = new Calculator();
	int rs=	calculator.calc(10,15, "SUB");
	Assert.assertEquals(-5, rs);
	
	}
	@Test
	public void test3()
	{
		Calculator calculator = new Calculator();
	int rs=	calculator.calc(10,15, "MUL");
	Assert.assertEquals(150, rs);
	
	}
	@Test
	public void test4()
	{
		Calculator calculator = new Calculator();
	int rs=	calculator.calc(10,1, "DIV");
	Assert.assertEquals(10, rs);
	

	
	
	
	
	}

}
