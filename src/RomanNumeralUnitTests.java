import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	@Test
	public void test() {
		RomanNumerals number = new RomanNumerals();
		assertEquals("I", number.toRoman(1));
	}

}
