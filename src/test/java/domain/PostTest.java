package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {
    @Test
    @DisplayName("게시글 생성")
    void postCreateTest() {
        double lat = 10.000001;
        double lng = 10.0000001;

        LatLng latLng = new LatLng(lat, lng);
        String address = "주소";
        List<PostImage> postImages = null;
        String content ="내용";
        String city = "서울시";
        Color color = new Color("#ffffff");
        LocalDateTime createDate = LocalDateTime.now();

        Post post = Post.create(latLng, address, postImages, content, city, color, createDate);

        assertNotNull(post);
    }
}