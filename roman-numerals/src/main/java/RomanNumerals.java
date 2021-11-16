public class RomanNumerals {
    public String toRoman(int decimal) {
        if (decimal == 1) {
            return "I" + toRoman(0);
        } else if (decimal == 2 ){
            return "I" + toRoman(1);
        } else if (decimal == 3) {
            return "I" + toRoman(2);
        } else if (decimal == 5) {
            return "V" + toRoman(0);
        } else if (decimal == 6) {
            return "V" + toRoman(1);
        } else if (decimal == 7) {
            return "V" + toRoman(2);
        } else if (decimal == 8) {
            return "V" + toRoman(3);
        }
        return "";
    }
}
