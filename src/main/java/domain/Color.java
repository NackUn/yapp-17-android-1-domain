package domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Color {
    private String rgb;
    private Emotion emotion;

    public Color(String rgb) {
        validate(rgb);
        this.rgb = rgb;
        this.emotion = null;
    }

    public Color(String rgb, Emotion emotion) {
        validate(rgb);
        this.rgb = rgb;
        this.emotion = emotion;
    }

    private void validate(String rgb) {
        Pattern pattern = Pattern.compile("^#[a-fA-F_0-9]X{6}$");

        Matcher matcher = pattern.matcher(rgb);

        if(!matcher.find()) {
            throw new IllegalArgumentException("형식에 맞는 rgb 값을 입력해주세요.");
        }
    }
}
