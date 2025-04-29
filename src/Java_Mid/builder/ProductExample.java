package Java_Mid.builder;

/*
실제 사용 사례: 상품 주문 시스템
- 상품 주문 시 다양한 옵션과 설정이 필요한 경우
- 필수 정보와 선택 정보가 명확히 구분되는 경우
- 객체의 불변성이 중요한 경우
*/

public class ProductExample {
    public static void main(String[] args) {
        // 기본 상품 주문
        Product basicProduct = new Product.Builder("노트북", 1000000)
                .build();
        System.out.println("기본 상품: " + basicProduct);

        // 모든 옵션이 포함된 상품 주문
        Product fullProduct = new Product.Builder("스마트폰", 1500000)
                .color("블랙")
                .warranty(24)
                .insurance(true)
                .giftWrapping(true)
                .build();
        System.out.println("풀옵션 상품: " + fullProduct);

        // 일부 옵션만 포함된 상품 주문
        Product customProduct = new Product.Builder("태블릿", 800000)
                .color("화이트")
                .warranty(12)
                .build();
        System.out.println("커스텀 상품: " + customProduct);
    }
}

class Product {
    // 필수 매개변수
    private final String name;
    private final int price;

    // 선택 매개변수
    private final String color;
    private final int warrantyMonths;
    private final boolean hasInsurance;
    private final boolean isGiftWrapped;

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.color = builder.color;
        this.warrantyMonths = builder.warrantyMonths;
        this.hasInsurance = builder.hasInsurance;
        this.isGiftWrapped = builder.isGiftWrapped;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", warranty=" + warrantyMonths + "개월" +
                ", insurance=" + (hasInsurance ? "가입" : "미가입") +
                ", giftWrap=" + (isGiftWrapped ? "포장" : "미포장") +
                '}';
    }

    public static class Builder {
        // 필수 매개변수
        private final String name;
        private final int price;

        // 선택 매개변수 - 기본값으로 초기화
        private String color = "기본색상";
        private int warrantyMonths = 0;
        private boolean hasInsurance = false;
        private boolean isGiftWrapped = false;

        public Builder(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder warranty(int months) {
            this.warrantyMonths = months;
            return this;
        }

        public Builder insurance(boolean hasInsurance) {
            this.hasInsurance = hasInsurance;
            return this;
        }

        public Builder giftWrapping(boolean isGiftWrapped) {
            this.isGiftWrapped = isGiftWrapped;
            return this;
        }

        public Product build() {
            // 필수 값 검증
            if (name == null || name.isEmpty()) {
                throw new IllegalStateException("상품명은 필수 입력값입니다.");
            }
            if (price <= 0) {
                throw new IllegalStateException("가격은 0보다 커야 합니다.");
            }
            return new Product(this);
        }
    }
} 