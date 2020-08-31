# yapp-17-android-1-domain
## 진행 방법
* 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

### 요구사항

## 객체 모델링

### domain.LatLng

- 좌표 값을 담은 객체
- (위도, 경도)
- [x] 위도는 소수점 6자리를, 경도는 소수점 7자리를 가진다.
    - [x] 위도가 소수점 6자리가 아니면 예외가 발생한다.
    - [x] 경도가 소수점 7자리가 아니면 예외가 발생한다.

### domain.PostImage

- (url)

### domain.Color

- (rgb, emotion)
- [x] rgb는 #으로 시작하고 0-9, a-f, A-F 중 6개의 값을 가진다.
    - [x] rgb가 #으로 시작하고 0-9, a-f, A-F 중 6개의 값이 아니면 예외가 발생한다.
- [x] Color의 emotion은 null일 수 있다.

### domain.Emotion

- (text)

### domain.Post

- (__latlng__, address, __[postImage]__, content, city, createDate) 
- [ ] 게시글 생성 및 toString 테스트
- [ ] 게시글을 생성할 때 여러 개의 사진을 달 수 있다.
- [ ] 사진 생성 테스트


### domain.Posts

- (__[domain.Post]__)
~~- [x] 저장된 글의 정보를 전체 조회할 때, 각각 글의 위도, 경도, 이미지url 정보가 조회된다.~~


### 로그인

### 게시글
- 게시글을 작성할 수 있다.
  - 게시글은 위경도, 주소, 이미지들, 내용(글), 도시, 생성날짜를 가진다.
    - 위경도는 위도, 경도를 가진다.
        - 위도는 소수점 6자리를 가진다.
        - 경도는 소수점 7자리를 가진다.
        - 위도, 경도 검색은 해당 사이트를 참고한다.
        - http://www.dawuljuso.com
    - 이미지는 url을 가진다.

- 게시글을 조회할 수 있다.
  - ~~게시글은 위도, 경도, 주소, 내용(이미지), 생성날짜를 가진다.~~
- 게시글 수정
  - ~~게시글은 고유한 id 값을 가진다.~~
- 게시글 삭제
- 게시글 전체 목록을 조회할 수 있다.

- 최근 6개월을 기준으로 게시판의 사진을 랜덤으로 가지고 올 수 있다.
  - 게시글은 생성날짜를 가진다.
  - 생성날짜를 기준으로 조회한 목록에서 랜덤으로 하나의 url을 출력한다.
  
- 한 게시글에 하나의 컬러를 선택한다.
  - 게시글은 컬러를 가진다.
- 한 컬러의 한 감정(텍스트)를 가질 수 있다.
  - 컬러는 감정을 가진다.
- 감정(텍스트)는 사용자가 커스텀할 수 있다.
  - 감정은 고유한 id를 가진다.
  
