public class RomanNumeralService {

    public String intToRomanNumeral(int num){

        if (num < 1 || num > 3000)
            throw new IllegalArgumentException("The number provided (%d) is not in the range 1-3000".formatted(num));
        return null;
    }

    public int romanNumeralToInt(String romanNumeral){
        return -1;
    }
}
