public class RomanNumerals {
    public String toRoman(int decimal) {
        if (decimal <= 0) {
            return "";
        }
        if (decimal == 1) {
            return "I" + toRoman(decimal - 1);
        } else if (decimal == 2 ){
            return "I" + toRoman(decimal - 1);
        } else if (decimal == 3) {
            return "I" + toRoman(decimal - 1);
        } else if (decimal == 5) {
            return "V" + toRoman(decimal - 5);
        } else if (decimal == 6) {
            return "V" + toRoman(decimal-5);
        } else if (decimal == 7) {
            return "V" + toRoman(decimal-5);
        } else if (decimal == 8) {
            return "V" + toRoman(decimal-5);
        }
        return null;
    }
}
