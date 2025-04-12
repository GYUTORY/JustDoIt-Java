package Java_Basic.class_basic;

/**
 * 상품 주문 프로그램의 실행 클래스
 * 이 클래스는 ProductOrder 클래스를 사용하여 여러 상품의 주문 정보를 관리하고
 * 총 결제 금액을 계산하는 예제를 제공합니다.
 */
public class ProduceOrderMain {
    /**
     * 프로그램의 시작점
     * 여러 상품의 주문 정보를 생성하고, 총 결제 금액을 계산하여 출력합니다.
     */
    public static void main(String[] args) {
        // ProductOrder 객체 배열 생성 (크기: 3)
        ProductOrder[] orders = new ProductOrder[3];

        // 첫 번째 상품 주문 정보 입력
        ProductOrder order1 = new ProductOrder();  // 객체 생성
        order1.productName = "두부";              // 상품명 설정
        order1.price = 2000;                      // 가격 설정
        order1.quantity = 2;                      // 수량 설정
        orders[0] = order1;                       // 배열에 저장
        
        // 두 번째 상품 주문 정보 입력
        ProductOrder order2 = new ProductOrder();  // 객체 생성
        order2.productName = "김치";              // 상품명 설정
        order2.price = 5000;                      // 가격 설정
        order2.quantity = 1;                      // 수량 설정
        orders[1] = order2;                       // 배열에 저장
        
        // 세 번째 상품 주문 정보 입력
        ProductOrder order3 = new ProductOrder();  // 객체 생성
        order3.productName = "콜라";              // 상품명 설정
        order3.price = 1500;                      // 가격 설정
        order3.quantity = 2;                      // 수량 설정
        orders[2] = order3;                       // 배열에 저장

        // 총 결제 금액 계산을 위한 변수 초기화
        int totalAmount = 0;

        // 향상된 for문을 사용하여 모든 주문 정보 출력 및 총액 계산
        for (ProductOrder order : orders) {
            // 각 주문의 상세 정보 출력
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            // 총액에 현재 주문의 금액(가격 * 수량)을 더함
            totalAmount += order.price * order.quantity;
        }

        // 최종 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalAmount);
    }
}
