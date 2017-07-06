package study.won.webserver.part2.CalculatorTest;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import study.won.webserver.part2.Calculator.Calculator;

public class CalculatorTest {
	Calculator cal;
	
	@Before
	public void setup(){
		System.out.println("@before");
		cal = new Calculator();
	}
	
	@After
	public void finish(){
		System.out.println("@After");
	}
	
	@Test
	public void add(){
		Assert.assertEquals(5, cal.add(2, 3));
	}
	
	@Test
	public void subtract(){
		Assert.assertEquals(2, cal.subtract(5, 3));
	}
	
	@Test
	public void multiply(){
		Assert.assertEquals(15, cal.multiply(3, 5));
	}
	
	@Test
	public void divide(){
		Assert.assertEquals(3, cal.divide(6, 2));
	}
	
	 
}
