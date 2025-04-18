package Java_Basic.class_basic.order;

/**
 * 상품 주문을 관리하는 클래스
 * 상품 정보와 주문 정보를 캡슐화하여 관리
 */
public class ProductOrder {
    // 필드 (private으로 정보 은닉)
    private String productName;     // 상품명
    private int price;             // 가격
    private int quantity;          // 수량
    private String orderId;        // 주문 번호
    private String orderDate;      // 주문 일자
    
    // 생성자
    public ProductOrder(String productName, int price, int quantity, String orderDate) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.orderId = generateOrderId();  // 주문 번호 자동 생성
    }
    
    // 주문 번호 생성 메서드 (private)
    private String generateOrderId() {
        // 주문 일자와 시스템 시간을 이용하여 고유한 주문 번호 생성
        return orderDate.replace("-", "") + 
               System.currentTimeMillis() % 10000;
    }
    
    // getter 메서드들
    public String getProductName() {
        return productName;
    }
    
    public int getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public String getOrderId() {
        return orderId;
    }
    
    public String getOrderDate() {
        return orderDate;
    }
    
    // 총 주문 금액 계산 메서드
    public int getTotalPrice() {
        return price * quantity;
    }
    
    // 할인 금액 계산 메서드
    public int getDiscountedPrice(double discountRate) {
        if (discountRate < 0 || discountRate > 1) {
            System.out.println("유효하지 않은 할인율입니다. (0-1)");
            return getTotalPrice();
        }
        return (int)(getTotalPrice() * (1 - discountRate));
    }
    
    // 주문 정보 출력 메서드
    public void printOrderInfo() {
        System.out.println("주문 번호: " + orderId);
        System.out.println("주문 일자: " + orderDate);
        System.out.println("상품명: " + productName);
        System.out.println("가격: " + price + "원");
        System.out.println("수량: " + quantity + "개");
        System.out.println("총 금액: " + getTotalPrice() + "원");
    }
}
