import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RomanNumeralServiceTest {

    RomanNumeralService romanNumeralService;

    @BeforeEach
    public void setup() {
        romanNumeralService = new RomanNumeralService();
    }

    @ParameterizedTest
    @ValueSource(ints = {-100, -2, 0, 3001, 5000, Integer.MAX_VALUE})
    public void romanNumeralToInt_shouldThrowWhenNumberIsNotInRange(int num) {
        assertThatThrownBy(() ->
                romanNumeralService.intToRomanNumeral(num))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The number provided (%s) is not in the range 1-3000".formatted(num));
    }

    @Test
    public void romanNumeralToInt_shouldReturnRomanNumeralBaseCaseIntegers() {
        assertThat(romanNumeralService.intToRomanNumeral(1)).isEqualTo("I");
        assertThat(romanNumeralService.intToRomanNumeral(5)).isEqualTo("V");
        assertThat(romanNumeralService.intToRomanNumeral(10)).isEqualTo("X");
        assertThat(romanNumeralService.intToRomanNumeral(50)).isEqualTo("L");
        assertThat(romanNumeralService.intToRomanNumeral(100)).isEqualTo("C");
        assertThat(romanNumeralService.intToRomanNumeral(500)).isEqualTo("D");
        assertThat(romanNumeralService.intToRomanNumeral(1000)).isEqualTo("M");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/integer_to_roman_numerals.csv")
    public void romanNumeralToInt_shouldReturnRomanNumeralForNonBaseCaseIntegers(final int input, final String expectedValue) {
        assertThat(romanNumeralService.intToRomanNumeral(input)).isEqualTo(expectedValue);
    }

    @Test
    public void shouldReturnPlaceValue() {
        final var num = 2679;

        final var actualThousandPlaceValue = romanNumeralService.getPlaceValue(num, 1000);
        final var actualHundredPlaceValue = romanNumeralService.getPlaceValue(num, 100);
        final var actualTenthPlaceValue = romanNumeralService.getPlaceValue(num, 10);
        final var actualUnitPlaceValue = romanNumeralService.getPlaceValue(num, 1);


        assertThat(actualThousandPlaceValue).isEqualTo(2000);
        assertThat(actualHundredPlaceValue).isEqualTo(600);
        assertThat(actualTenthPlaceValue).isEqualTo(70);
        assertThat(actualUnitPlaceValue).isEqualTo(9);
    }


}