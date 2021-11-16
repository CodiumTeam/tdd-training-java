import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

	@ParameterizedTest
	@CsvSource({
			"1,I",
			"2,II",
			"3,III",
	})
	public void translate_numbers(int decimal, String expectedRoman) {
		RomanNumerals converter = new RomanNumerals();

		String roman = converter.toRoman(decimal);

		assertEquals(expectedRoman, roman);
	}

}
