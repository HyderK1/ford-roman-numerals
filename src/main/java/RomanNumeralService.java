import java.util.HashMap;

public class RomanNumeralService {

    final HashMap<Integer, String> romanNumerals;

    public RomanNumeralService() {
        this.romanNumerals = buildRomanNumerals();
    }

    public String intToRomanNumeral(final int num) {

        if (num < 1 || num > 3000)
            throw new IllegalArgumentException("The number provided (%d) is not in the range 1-3000".formatted(num));

        return romanNumerals.get(getPlaceValue(num, 1000)) +
                romanNumerals.get(getPlaceValue(num, 100)) +
                romanNumerals.get(getPlaceValue(num, 10)) +
                romanNumerals.get(getPlaceValue(num, 1));
    }

    public int getPlaceValue(final int number, final int placeValue) {
        return (number / placeValue % 10) * placeValue;
    }


    private HashMap<Integer, String> buildRomanNumerals() {
        final var romanNumerals = new HashMap<Integer, String>();

        romanNumerals.put(0, "");
        romanNumerals.put(1, "I");
        romanNumerals.put(2, "II");
        romanNumerals.put(3, "III");
        romanNumerals.put(4, "IV");
        romanNumerals.put(5, "V");
        romanNumerals.put(6, "VI");
        romanNumerals.put(7, "VII");
        romanNumerals.put(8, "VIII");
        romanNumerals.put(9, "IX");

        romanNumerals.put(10, "X");
        romanNumerals.put(20, "XX");
        romanNumerals.put(30, "XXX");
        romanNumerals.put(40, "XL");
        romanNumerals.put(50, "L");
        romanNumerals.put(60, "LX");
        romanNumerals.put(70, "LXX");
        romanNumerals.put(80, "LXXX");
        romanNumerals.put(90, "XC");

        romanNumerals.put(100, "C");
        romanNumerals.put(200, "CC");
        romanNumerals.put(300, "CCC");
        romanNumerals.put(400, "CD");
        romanNumerals.put(500, "D");
        romanNumerals.put(600, "DC");
        romanNumerals.put(700, "DCC");
        romanNumerals.put(800, "DCCC");
        romanNumerals.put(900, "CM");

        romanNumerals.put(1000, "M");
        romanNumerals.put(2000, "MM");
        romanNumerals.put(3000, "MMM");

        return romanNumerals;
    }
}
