import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> values() {
        ArrayList<String> values = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            values.add(String.valueOf(i + 1));
        }
        return values;
    }
}
