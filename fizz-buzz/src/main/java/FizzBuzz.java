import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> values() {
        ArrayList<String> values = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            values.add(getValue(i + 1));
        }
        return values;
    }

    private static String getValue(int number) {
        if (isFizzBuzz(number)) {
            return "FizzBuzz";
        } else if (isFizz(number)) {
            return "Fizz";
        } else if (isBuzz(number)) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    private static boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
