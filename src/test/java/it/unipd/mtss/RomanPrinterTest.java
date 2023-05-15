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
	
	@Test
	public void Test10() {
		String romanNumber = IntegerToRoman.convert(10);
		
		assertEquals("X", romanNumber);
	}
	
	@Test
	public void Test50() {
		String romanNumber = IntegerToRoman.convert(50);
		
		assertEquals("L", romanNumber);
	}

	@Test
	public void Test100() {
		String romanNumber = IntegerToRoman.convert(100);
		
		assertEquals("C", romanNumber);
	}

	@Test
	public void Test500() {
		String romanNumber = IntegerToRoman.convert(500);
		
		assertEquals("D", romanNumber);
	}

	@Test
	public void Test1000() {
		String romanNumber = IntegerToRoman.convert(1000);
		
		assertEquals("M", romanNumber);
	}

	@Test
	public void Test31() {
		String romanNumber = IntegerToRoman.convert(31);
		
		assertEquals("XXXI", romanNumber);
	}

	@Test
	public void Test148() {
		String romanNumber = IntegerToRoman.convert(148);
		
		assertEquals("CXLVIII", romanNumber);
	}

	@Test
	public void Test294() {
		String romanNumber = IntegerToRoman.convert(294);
		
		assertEquals("CCXCIV", romanNumber);
	}
	
	@Test
	public void Test312() {
		String romanNumber = IntegerToRoman.convert(312);
		
		assertEquals("CCCXII", romanNumber);
	}
	
	@Test
	public void Test421() {
		String romanNumber = IntegerToRoman.convert(421);
		
		assertEquals("CDXXI", romanNumber);
	}
	
	@Test
	public void Test528() {
		String romanNumber = IntegerToRoman.convert(528);
		
		assertEquals("DXXVIII", romanNumber);
	}
	
	@Test
	public void Test621() {
		String romanNumber = IntegerToRoman.convert(621);
		
		assertEquals("DCXXI", romanNumber);
	}
	
	@Test
	public void Test782() {
		String romanNumber = IntegerToRoman.convert(782);
		
		assertEquals("DCCLXXXII", romanNumber);
	}
	
	@Test
	public void Test870() {
		String romanNumber = IntegerToRoman.convert(870);
		
		assertEquals("DCCCLXX", romanNumber);
	}
	
	@Test
	public void Test941() {
		String romanNumber = IntegerToRoman.convert(941);
		
		assertEquals("CMXLI", romanNumber);
	}
	
}
