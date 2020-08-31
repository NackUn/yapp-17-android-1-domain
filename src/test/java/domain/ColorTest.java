package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {
    @Test
    @DisplayName("Color의 emotion은 null일 수 있다.")
    void colorTest() {
        String white = "#ffffff";

        Color color = new Color(white, null);

        assertNotNull(color);
    }

    @ParameterizedTest
    @ValueSource(strings = {"##00000", "000000", "#00000", "0000000"})
    @DisplayName("경도의 소수점이 7자리가 아니면 예외가 발생한다")
    void validateTest(String rgb) {
        assertThrows(IllegalArgumentException.class, () -> new Color(rgb));
    }

}