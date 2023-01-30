package kata.code;

import org.junit.jupiter.api.Test;

import static kata.code.util.Calculation.calc;
import static kata.code.util.Formatter.checkFormat;
import static kata.code.util.Formatter.romeToInt;
import static kata.code.util.Rome.convertToRome;
import static org.assertj.core.api.Assertions.assertThat;


class MainTest {



    @Test
    void checkFormatTest() throws Exception {

        String actual1 = checkFormat("X", "I");
        String actual2 = checkFormat("3", "4");

        assertThat(actual1).isEqualTo("Rome");
        assertThat(actual2).isEqualTo("Arabic");

        assertThat(romeToInt("II")).isEqualTo(2);
        assertThat(convertToRome(1)).isEqualTo("I");
    }

    @Test
    void testArabicNumber() throws Exception {
        String actual = calc("1 + 2");
        assertThat(actual).isEqualTo("3");

        String actual2 = calc("10 / 5");
        assertThat(actual2).isEqualTo("2");

        String actual3 = calc("6 - 4");
        assertThat(actual3).isEqualTo("2");

        String actual4 = calc("2 * 2");
        assertThat(actual4).isEqualTo("4");
    }
    @Test
    void testRomeNumber() throws Exception {
        String actual = calc("X + X");
        assertThat(actual).isEqualTo("XX");

        String actual2 = calc("X / II");
        assertThat(actual2).isEqualTo("V");

        String actual3 = calc("VI - IV");
        assertThat(actual3).isEqualTo("II");

        String actual4 = calc("II * III");
        assertThat(actual4).isEqualTo("VI");
    }
}
