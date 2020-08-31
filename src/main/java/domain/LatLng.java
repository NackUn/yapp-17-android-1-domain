package domain;

public class LatLng {
    private double lat;
    private double lng;

    public LatLng(double lat, double lng) {
        int DECIMAL_POINT_LAT = 6;
        validate(lat, DECIMAL_POINT_LAT);
        int DECIMAL_POINT_LNG = 7;
        validate(lng, DECIMAL_POINT_LNG);

        this.lat = lat;
        this.lng = lng;
    }

    private void validate(double value, int decimalPoint) {
        String strValue = String.valueOf(value);
        int strValueLength = strValue.length();
        int dotIndex = strValue.indexOf('.');

        if (strValueLength != dotIndex + decimalPoint + 1) {
            throw new IllegalArgumentException("6자리의 소수점을 입력해주세요.");
        }
    }

}
