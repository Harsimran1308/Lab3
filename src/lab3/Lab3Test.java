package lab3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import CustomCommonFunctions.CommonFunctions;

import org.junit.runner.RunWith;
import CustomTrignometricFunctions.Sin;
import CustomTrignometricFunctions.Cos;
import CustomTrignometricFunctions.Tan;

@RunWith(Parameterized.class)
public class Lab3Test {
	private Integer value;
	
	public Lab3Test(int value) {
      this.value = value;
	}
	
	 @Parameterized.Parameters
	   public static Collection inputValue() {
	      return Arrays.asList(new Object[] {
	         30,
	         120,
	         220,
	         330,
	         360,
	         0,
	         -20,
	         -180,
	         -260,
	         -340
	      });
	   }

	@Test
	public void testSin() {
		assertEquals(Math.sin(value),Sin.getSin(value),0.001);
	}
	
	@Test
	public void testSinDegree() {
		assertEquals(Math.toDegrees(Math.sin(Math.toRadians(value))), Sin.getSinDegree(value), 0.001);
	}
	
	@Test
	public void testCos() {
		assertEquals(Math.cos(value),Cos.getCos(value),0.001);
	}
	
	@Test
	public void testCosDegree() {
		assertEquals(Math.toDegrees(Math.cos(Math.toRadians(value))), Cos.getCosDegree(value), 0.001);
	}
	
	@Test
	public void testTan() {
		assertEquals(Math.tan(value),Tan.getTan(value),0.001);
	}
	
	@Test
	public void testTanDegree() {
		assertEquals(Math.toDegrees(Math.tan(Math.toRadians(value))), Tan.getTanDegree(value), 0.001);
	}
	
	@Test
	public void testRadianConversion() {
		assertEquals(Math.toRadians(value), CommonFunctions.toRadian(value), 0.001);
	}

	@Test
	public void testDegreeConversion() {
		assertEquals(Math.toDegrees(value), CommonFunctions.toDegree(value), 0.001);
	}
	
	@Test
	public void testFactorialFunction() {
		assertEquals(120, CommonFunctions.fact(5), 0.001);
	}
	
	@Test
	public void testPowerFunction() {
		assertEquals(Math.pow(2, 2), CommonFunctions.pow(2, 2), 0.001);
	}
	
	

}
