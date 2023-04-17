import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {

	@Test
	public void return_100_values() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> values = fizzBuzz.values();

		assertEquals(100, values.toArray().length);
	}
	@Test
	public void first_value_is_1() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> values = fizzBuzz.values();

		assertEquals("1", values.get(0));
	}

	@Test
	public void second_value_is_2() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> values = fizzBuzz.values();

		assertEquals("2", values.get(1));
	}

}
