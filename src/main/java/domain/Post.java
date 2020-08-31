package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LatLng latLng;
    private String address;
    private List<PostImage> postImages;
    private String content;
    private String city;
    private Color color;
    private LocalDateTime createDate;

    private Post() {
    }

    private Post(LatLng latLng, String address, List<PostImage> postImages, String content, String city, Color color, LocalDateTime createDate) {
        this.latLng = latLng;
        this.address = address;
        this.postImages = new ArrayList<>();
        this.content = content;
        this.city = city;
        this.color = color;
        this.createDate = createDate;
    }

    public static Post create(LatLng latLng, String address, List<PostImage> postImages, String content, String city, Color color, LocalDateTime createDate) {
        return new Post(latLng, address, postImages, content, city, color, createDate);
    }

    private void setPostImages(List<PostImage> postImages) {
        this.postImages = postImages;
    }

    @Override
    public String toString() {
        return "Post{" +
                "latLng=" + latLng +
                ", address='" + address + '\'' +
                ", postImages=" + postImages +
                ", content='" + content + '\'' +
                ", city='" + city + '\'' +
                ", color=" + color +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
