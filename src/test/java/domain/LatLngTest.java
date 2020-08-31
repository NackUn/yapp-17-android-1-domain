package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LatLngTest {
    @Test
    @DisplayName("위도는 소수점 6자리를, 경도는 소수점 7자리를 가진다.")
    void latTest() {
        double lat = 10.000001;
        double lng = 10.0000001;

        LatLng latLng = new LatLng(lat, lng);

        assertNotNull(latLng);
    }

    @ParameterizedTest
    @ValueSource(doubles = {10.000000, 0.000000, 10.0000001, 0.0000001})
    @DisplayName("위도의 소수점이 6자리가 아니면 예외가 발생한다")
    void validateLatTest(double lat) {
        double lng = 1.0000001; // 7자리 숫자
        assertThrows(IllegalArgumentException.class, () -> new LatLng(lat, lng));
    }

    @ParameterizedTest
    @ValueSource(doubles = {10.0000000, 0.0000000, 10.00000001, 0.00000001})
    @DisplayName("경도의 소수점이 7자리가 아니면 예외가 발생한다")
    void validateLngTest(double lat) {
        double lng = 1.000001; // 6자리 숫자
        assertThrows(IllegalArgumentException.class, () -> new LatLng(lat, lng));
    }

}