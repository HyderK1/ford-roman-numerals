import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
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
    public void romanNumeralToInt_shouldReturnRomanNumeralForKeyIntegers() {
        assertThat(romanNumeralService.intToRomanNumeral(1)).isEqualTo("I");
        assertThat(romanNumeralService.intToRomanNumeral(5)).isEqualTo("V");
        assertThat(romanNumeralService.intToRomanNumeral(10)).isEqualTo("X");
        assertThat(romanNumeralService.intToRomanNumeral(50)).isEqualTo("L");
        assertThat(romanNumeralService.intToRomanNumeral(100)).isEqualTo("C");
        assertThat(romanNumeralService.intToRomanNumeral(500)).isEqualTo("D");
        assertThat(romanNumeralService.intToRomanNumeral(1000)).isEqualTo("M");
    }


}