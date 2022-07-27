import java.util.HashMap;

public class RomanNumeralService {

    final HashMap<Integer, String> romanNumerals;

    public RomanNumeralService() {
        this.romanNumerals = buildRomanNumerals();
    }

    public String intToRomanNumeral(int num){

        if (num < 1 || num > 3000)
            throw new IllegalArgumentException("The number provided (%d) is not in the range 1-3000".formatted(num));

        return romanNumerals.get(num);
    }

    public int romanNumeralToInt(String romanNumeral){
        return -1;
    }


    private HashMap<Integer, String> buildRomanNumerals() {
        final var romanNumerals = new HashMap<Integer, String>();

        romanNumerals.put(0, "");
        romanNumerals.put(1, "I");
        romanNumerals.put(5, "V");
        romanNumerals.put(10, "X");
        romanNumerals.put(50, "L");
        romanNumerals.put(100, "C");
        romanNumerals.put(500, "D");
        romanNumerals.put(1000, "M");

        return romanNumerals;
    }
}
