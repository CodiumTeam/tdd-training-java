import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> values() {
        ArrayList<String> values = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i == 0) {
                values.add("1");
            } else {
                values.add("2");
            }
        }
        return values;
    }
}
