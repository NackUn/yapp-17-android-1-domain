package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmotionTest {
    @Test
    @DisplayName("Emotion은 반드시 text를 가진다.")
    void emotionTest() {
        String text = "기쁨";

        Emotion emotion = new Emotion(text);

        assertNotNull(emotion);
    }
}