package Java_Basic.Scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCost = 0;

        while (true) {
            System.out.println("\n1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            if (menu == 1) {
                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                totalCost += price * quantity;
                System.out.println("상품명: " + product + ", 가격: " + price + ", 수량: " + quantity + ", 합계: " + price * quantity);

            } else if (menu == 2) {
                System.out.println("총 비용: " + totalCost + "원");
                totalCost = 0; // 결제 후 총 비용 초기화

            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("올바른 메뉴를 선택해주세요.");
            }
        }
    }
}
