package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        /**
         * System.in은 Java에서 표준 입력 스트림을 나타내는 객체입니다. 주로 사용자가 키보드로 입력한 데이터를 읽어들이기 위해 사용됩니다. Scanner 클래스는 이 입력 스트림을 통해 데이터를 읽을 수 있도록 도와주는 도구입니다.
         * 즉, Scanner scanner = new Scanner(System.in); 코드는 System.in을 사용하여 사용자로부터 입력을 받을 수 있는 Scanner 객체를 생성하는 것입니다. 이 객체를 통해 사용자는 다양한 데이터 타입(예: 문자열, 정수 등)의 입력을 쉽게 받을 수 있습니다.
         */
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.println("결제 수단을 입력하세요: ");
            String payOption = scanner.nextLine();

            if(payOption.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.println("결제 금액을 입력하세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(payOption, amount);
        }

    }
}

