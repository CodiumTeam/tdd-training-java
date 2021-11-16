public class RomanNumerals {
    public String toRoman(int decimal) {
        if (decimal <= 0) {
            return "";
        }
        if (decimal >= 10) {
            return "X" + toRoman(decimal - 10);
        }
        if (decimal >= 5) {
            return "V" + toRoman(decimal - 5);
        }
        if (decimal >= 1) {
            return "I" + toRoman(decimal - 1);
        }
        return null;
    }
}
