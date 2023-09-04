import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

	@Test
	public void the_first_element_is_1() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> numbers = fizzBuzz.execute();

		assertEquals("1", numbers.get(0));
	}

}
