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

}
