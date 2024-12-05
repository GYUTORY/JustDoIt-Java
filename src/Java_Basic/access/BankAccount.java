// TIL - 접근제어자 통해, 캡슐화가 잘된 예시를 알아보자.

// -> 접근 제어자와 캡슐화를 통해 데이터를 안전하게 보호하는 것은 물론이고, BankAccount를 사용하는 개발자 입장에서 입장에서 해당 기능을 사용하는 복잡도도 낮출 수 있다.


package Java_Basic.access;

public class BankAccount {

    // 데이터 필드는 외부에 직접 노출하지 않는다. BankAccount가 제공하는 메서드만 통해서만 접근할 수 있다.
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드: deposit
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
            return;
        }
        System.out.println("유효하지 않은 금액입니다.");
    }

    // public 메서드: withdraw
    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
            return;
        }
        System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
    }

    public int getBalance() {
        return balance;
    }

    // 입력 금액을 검증하는 기능은 내부에서만 필요한 기능이다. 따라서 private을 사용했다.
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}
