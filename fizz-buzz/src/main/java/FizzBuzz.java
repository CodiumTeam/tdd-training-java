import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> values() {
        ArrayList<String> values = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if ((i + 1) % 3  == 0 && (i+1)% 5 == 0) {
                values.add("FizzBuzz");
            } else if ((i + 1) % 3  == 0) {
                values.add("Fizz");
            } else if ((i + 1) % 5  == 0) {
                values.add("Buzz");
            } else {
                values.add(String.valueOf(i + 1));
            }
        }
        return values;
    }
}
