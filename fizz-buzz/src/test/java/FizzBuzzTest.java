import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

	@Test
	public void return_100_values() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> values = fizzBuzz.values();

		assertEquals(100, values.toArray().length);
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 2, 4})
	public void numbers_that_are_not_multiple_returns_the_value_as_string(int number) {
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> values = fizzBuzz.values();

		assertEquals(String.valueOf(number), values.get(number-1));
	}

	@ParameterizedTest
	@ValueSource(ints = {3, 6, 9})
	public void multiple_of_three_are_fizz(int number) {
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> values = fizzBuzz.values();

		assertEquals("Fizz", values.get(number-1));
	}

	@ParameterizedTest
	@ValueSource(ints = {5, 10, 20})
	public void multiple_of_five_are_buzz(int number) {
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> values = fizzBuzz.values();

		assertEquals("Buzz", values.get(number-1));
	}

	@ParameterizedTest
	@ValueSource(ints = {15, 30, 45})
	public void multiple_of_three_and_five_are_fizzbuzz(int number) {
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> values = fizzBuzz.values();

		assertEquals("FizzBuzz", values.get(number-1));
	}
}
