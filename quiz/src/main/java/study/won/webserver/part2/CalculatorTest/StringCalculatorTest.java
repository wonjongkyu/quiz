package study.won.webserver.part2.CalculatorTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import study.won.webserver.part2.Calculator.StringCalculator;

public class StringCalculatorTest {
	
	StringCalculator strCal;
	
	@Before
	public void setup(){
		System.out.println("@Before : setup()");
		strCal = new StringCalculator();
	}
	
	@Test
	public void isNullTest(){
		Assert.assertEquals(0, strCal.add(null));
		Assert.assertEquals(0, strCal.add(""));
	}
	
	@Test
	public void addOneTest(){
		Assert.assertEquals(5, strCal.add("5"));
	}
	
	@Test
	public void addMoreTest(){
		Assert.assertEquals(10, strCal.add("3;7"));
		Assert.assertEquals(20, strCal.add("3;7,10"));
		Assert.assertEquals(60, strCal.add("3;7,10;40"));
	}
	
	@Test
	public void addCustomTest(){
		Assert.assertEquals(10, strCal.add("//@\n3@7"));
	}
	
	/* 
	 * 참고함 
	 * 
	 */
	@Test(expected =RuntimeException.class)
	public void addNegativeTest(){
		Assert.assertEquals(0, strCal.add("3;-7"));
	}
}
