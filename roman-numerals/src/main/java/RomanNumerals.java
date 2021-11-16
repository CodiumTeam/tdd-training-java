import java.util.*;

public class RomanNumerals {
    public String toRoman(int decimal) {
        LinkedHashMap<Integer, String> conversionTable = new LinkedHashMap<>(){{
            put(10, "X");
            put(5, "V");
            put(1, "I");
        }};

        for (Integer key: conversionTable.keySet()) {
            if (decimal >= key) {
                return conversionTable.get(key) + toRoman(decimal - key);
            }
        }

        return "";
    }
}
