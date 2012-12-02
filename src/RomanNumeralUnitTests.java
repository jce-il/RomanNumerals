import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	@Test
	public void testThat1ReturnsI() {
		RomanNumerals number = new RomanNumerals();
		assertEquals("I", number.toRoman(1));
	}
	@Test
	public void testThat2ReturnsII() {
		RomanNumerals number = new RomanNumerals();
		assertEquals("II", number.toRoman(2));
	}

}
