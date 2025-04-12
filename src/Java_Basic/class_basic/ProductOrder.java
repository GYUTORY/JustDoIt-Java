package Java_Basic.class_basic;

/**
 * 상품 주문 정보를 표현하는 클래스
 * 이 클래스는 상품의 이름, 가격, 수량을 저장하는 데이터 구조를 정의합니다.
 * 
 * 클래스 설계 시 고려사항:
 * 1. 단일 책임 원칙 (Single Responsibility Principle)을 따름
 * 2. 주문 정보와 관련된 필수 속성만 포함
 * 3. 각 필드의 의미가 명확하도록 설계
 */
public class ProductOrder {
    /**
     * 상품의 이름을 저장하는 필드
     * String 타입: 상품명은 문자열로 표현
     */
    String productName;

    /**
     * 상품의 가격을 저장하는 필드
     * int 타입: 가격은 정수로 표현 (원 단위)
     */
    int price;

    /**
     * 주문 수량을 저장하는 필드
     * int 타입: 수량은 정수로 표현
     */
    int quantity;
}
