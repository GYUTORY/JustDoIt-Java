package Java_Basic.class_basic.review;

/**
 * 영화 리뷰 프로그램의 실행 클래스
 * MovieReview 클래스를 사용하여 여러 영화의 리뷰 정보를 관리하는 예제
 */
public class MovieReviewMain2 {
    public static void main(String[] args) {
        // MovieReview 객체 배열 생성
        MovieReview[] reviews = new MovieReview[2];

        // 첫 번째 영화 리뷰 생성
        reviews[0] = new MovieReview(
            "인셉션",
            "인생은 무한 루프",
            4.5,
            "김철수"
        );

        // 두 번째 영화 리뷰 생성
        reviews[1] = new MovieReview(
            "어바웃 타임",
            "인생 시간 영화!",
            5.0,
            "홍길동"
        );

        // 모든 리뷰 정보 출력
        for (MovieReview review : reviews) {
            review.printReview();
            System.out.println(); // 리뷰 사이 빈 줄 추가
        }
    }
}
