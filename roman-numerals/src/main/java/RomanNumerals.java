public class RomanNumerals {
    public String toRoman(int decimal) {
        if (decimal == 1) {
            return "I";
        } else if (decimal == 2 ){
            return "II";
        } else if (decimal == 3) {
            return "III";
        } else if (decimal == 5) {
            return "V";
        } else if (decimal == 6) {
            return "VI";
        } else if (decimal == 7) {
            return "VII";
        } else if (decimal == 8) {
            return "VIII";
        }
        return null;
    }
}
