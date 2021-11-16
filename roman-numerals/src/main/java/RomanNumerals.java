public class RomanNumerals {
    public String toRoman(int decimal) {
        if (decimal == 1) {
            return "I";
        } else if (decimal == 2 ){
            return "II";
        } else if (decimal == 3) {
            return "III";
        }
        return null;
    }
}
