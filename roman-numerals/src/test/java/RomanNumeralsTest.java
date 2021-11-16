import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

	@ParameterizedTest
	@CsvSource({
			"1,I",
			"2,II",
			"3,III",
			"5,V",
			"6,VI",
			"7,VII",
			"8,VIII",
			"10,X",
			"11,XI",
			"12,XII",
			"18,XVIII",
	})
	public void translate_numbers(int decimal, String expectedRoman) {
		RomanNumerals converter = new RomanNumerals();

		String roman = converter.toRoman(decimal);

		assertEquals(expectedRoman, roman);
	}

}
