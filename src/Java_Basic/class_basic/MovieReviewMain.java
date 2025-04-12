package Java_Basic.class_basic;

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
        // MovieReview 클래스의 인스턴스 생성
        MovieReview ironMan = new MovieReview();

        // 생성된 객체의 필드에 값 설정
        ironMan.title = "아이언맨3";
        ironMan.review = "희대의 명작이라고 생각함, 남자의 심금을 울린달까?";

        // 단일 영화 리뷰 출력
        System.out.println("영화제목 : " + ironMan.title + " 리뷰 : " + ironMan.review);

        // MovieReview 객체 배열 생성 및 초기화
        MovieReview[] movieReviews = {ironMan};

        // 향상된 for문을 사용한 배열 순회
        // for (타입 변수명 : 배열/컬렉션) 형태로 사용
        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화제목 : " + movieReview.title + " 리뷰 : " + movieReview.review);
        }
    }
}
