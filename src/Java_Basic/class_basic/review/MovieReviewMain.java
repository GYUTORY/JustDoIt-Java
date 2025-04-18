package Java_Basic.class_basic.review;

/**
 * 영화 리뷰 프로그램의 실행 클래스
 * 이 클래스는 MovieReview 클래스를 사용하여 영화 리뷰를 생성하고 출력하는 예제를 제공합니다.
 */
public class MovieReviewMain {
    /**
     * 프로그램의 시작점
     * 영화 리뷰 객체를 생성하고, 데이터를 설정한 후 출력하는 기능을 수행합니다.
     */
    public static void main(String[] args) {
        // MovieReview 객체 생성
        MovieReview ironMan = new MovieReview(
            "아이언맨3",
            "희대의 명작이라고 생각함, 남자의 심금을 울린달까?",
            5.0,  // 최고 평점
            "토니 스타크"
        );

        // 단일 영화 리뷰 출력
        System.out.println("=== 단일 리뷰 출력 ===");
        ironMan.printReview();
        System.out.println();

        // MovieReview 객체 배열 생성 및 초기화
        MovieReview[] movieReviews = {ironMan};

        // 향상된 for문을 사용한 배열 순회
        System.out.println("=== 전체 리뷰 출력 ===");
        for (MovieReview movieReview : movieReviews) {
            movieReview.printReview();
            System.out.println();
        }
    }
}
