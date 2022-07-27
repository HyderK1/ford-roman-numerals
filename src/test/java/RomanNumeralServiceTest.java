import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RomanNumeralServiceTest {

    RomanNumeralService romanNumeralService;

    @BeforeEach
    public void setup() {
        romanNumeralService = new RomanNumeralService();
    }

    @Test
    public void romanNumeralToInt_shouldThrowWhenNumberIsNotInRange() {
        assertThatThrownBy(() ->
                romanNumeralService.intToRomanNumeral(-2))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("The number provided (-2) is not in the range 1-3000");
    }

}