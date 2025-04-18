package Java_Basic.class_basic.review;

/**
 * 영화 리뷰를 관리하는 클래스
 * 영화 정보와 리뷰 정보를 캡슐화하여 관리
 */
public class MovieReview {
    // 필드 (private으로 정보 은닉)
    private String title;      // 영화 제목
    private String review;     // 리뷰 내용
    private double rating;     // 평점 (0.0 ~ 5.0)
    private String reviewer;   // 작성자
    
    // 생성자
    public MovieReview(String title, String review, double rating, String reviewer) {
        this.title = title;
        this.review = review;
        setRating(rating);  // 유효성 검사를 위해 setter 사용
        this.reviewer = reviewer;
    }
    
    // rating의 setter (유효성 검사 포함)
    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        } else {
            System.out.println("유효하지 않은 평점입니다. (0.0-5.0)");
            this.rating = 0.0;
        }
    }
    
    // getter 메서드들
    public String getTitle() {
        return title;
    }
    
    public String getReview() {
        return review;
    }
    
    public double getRating() {
        return rating;
    }
    
    public String getReviewer() {
        return reviewer;
    }
    
    // 별점을 문자열로 변환하는 메서드
    public String getStarRating() {
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < (int)rating; i++) {
            stars.append("★");
        }
        if (rating % 1 >= 0.5) {
            stars.append("☆");
        }
        return stars.toString();
    }
    
    // 리뷰 정보 출력 메서드
    public void printReview() {
        System.out.println("영화: " + title);
        System.out.println("평점: " + rating + " " + getStarRating());
        System.out.println("작성자: " + reviewer);
        System.out.println("리뷰: " + review);
    }
}
