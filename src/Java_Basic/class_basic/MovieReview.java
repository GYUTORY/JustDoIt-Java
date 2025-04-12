package Java_Basic.class_basic;

/**
 * 영화 리뷰를 표현하는 클래스
 * 이 클래스는 영화의 제목과 리뷰 내용을 저장하는 데이터 구조를 정의합니다.
 * 
 * 클래스 설계 시 고려사항:
 * 1. 단일 책임 원칙 (Single Responsibility Principle)을 따름
 * 2. 데이터와 관련된 속성만 포함
 * 3. 명확하고 이해하기 쉬운 필드명 사용
 */
public class MovieReview {
    /**
     * 영화 제목을 저장하는 필드
     * String 타입: 영화 제목은 문자열로 표현
     */
    String title;

    /**
     * 영화에 대한 리뷰 내용을 저장하는 필드
     * String 타입: 리뷰 내용은 문자열로 표현
     */
    String review;
}
