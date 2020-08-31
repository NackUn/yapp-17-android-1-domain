package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostImageTest {
    @Test
    @DisplayName("이미지는 반드시 url을 가진다.")
    void postImageTest() {
        String url = "www.naver.com";

        PostImage postImage = new PostImage(url);

        assertNotNull(postImage);
    }
}