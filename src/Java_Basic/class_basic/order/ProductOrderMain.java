package Java_Basic.class_basic.order;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 상품 주문 프로그램의 실행 클래스
 * 이 클래스는 ProductOrder 클래스를 사용하여 여러 상품의 주문 정보를 관리하고
 * 총 결제 금액을 계산하는 예제를 제공합니다.
 */
public class ProductOrderMain {
    /**
     * 프로그램의 시작점
     * 여러 상품의 주문 정보를 생성하고, 총 결제 금액을 계산하여 출력합니다.
     */
    public static void main(String[] args) {
        // 현재 날짜를 문자열로 변환
        String orderDate = LocalDate.now().format(DateTimeFormatter.ISO_DATE);

        // ProductOrder 객체 배열 생성 (크기: 3)
        ProductOrder[] orders = new ProductOrder[3];

        // 첫 번째 상품 주문 정보 입력
        orders[0] = new ProductOrder("두부", 2000, 2, orderDate);
        
        // 두 번째 상품 주문 정보 입력
        orders[1] = new ProductOrder("김치", 5000, 1, orderDate);
        
        // 세 번째 상품 주문 정보 입력
        orders[2] = new ProductOrder("콜라", 1500, 2, orderDate);

        // 총 결제 금액 계산을 위한 변수 초기화
        int totalAmount = 0;

        // 향상된 for문을 사용하여 모든 주문 정보 출력 및 총액 계산
        for (ProductOrder order : orders) {
            // 각 주문의 상세 정보 출력
            order.printOrderInfo();
            System.out.println(); // 주문 정보 사이 빈 줄 추가
            // 총액에 현재 주문의 금액 추가
            totalAmount += order.getTotalPrice();
        }

        // 최종 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalAmount + "원");
    }
}
