////////////////////////////////////////////////////////////////////
// [MATTEO ALBERTO] [ROCCO] [2042354]
// [ION] [BOUROSU] [2010006]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.Assert.*;
import org.junit.Test;
public class RomanPrinterTest {

	@Test(expected = Exception.class)
	public void TestEqualZero() throws Exception {  	    
		String expected="Valori non consentiti";
		
		assertEquals(RomanPrinter.print(0), expected);
	}
	
	@Test(expected = Exception.class)
	public void TestNegative() throws Exception {  	    
		String expected="Valori non consentiti";
		
		assertEquals(RomanPrinter.print(-10), expected);
	}
	
	@Test(expected = Exception.class)
	public void TestBiggerThanOneThousand() throws Exception {  	    
		String expected="Valori non consentiti";
		
		assertEquals(RomanPrinter.print(1001), expected);
	}
	
	@Test
	public void Test30() {
		String romanNumber = IntegerToRoman.convert(30);
		
		assertEquals("XXX", romanNumber);
	}
	
	@Test
	public void Test800() {
		String romanNumber = IntegerToRoman.convert(800);
		
		assertEquals("DCCC", romanNumber);
	}
	
	@Test
	public void Test1() {
		String romanNumber = IntegerToRoman.convert(1);
		
		assertEquals("I", romanNumber);
	}
	
	@Test
	public void Test4() {
		String romanNumber = IntegerToRoman.convert(4);
		
		assertEquals("IV", romanNumber);
	}
	
	@Test
	public void Test5() {
		String romanNumber = IntegerToRoman.convert(5);
		
		assertEquals("V", romanNumber);
	}
	
	@Test
	public void Test9() {
		String romanNumber = IntegerToRoman.convert(9);
		
		assertEquals("IX", romanNumber);
	}
}
