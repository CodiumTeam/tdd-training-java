public class RomanNumerals {
    public String toRoman(int decimal) {
        if (decimal <= 0) {
            return "";
        }
        if (decimal <= 3) {
            return "I" + toRoman(decimal - 1);
        } else if (decimal <= 8) {
            return "V" + toRoman(decimal - 5);
        }
        return null;
    }
}
