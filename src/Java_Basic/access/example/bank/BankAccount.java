// TIL - 접근제어자 통해, 캡슐화가 잘된 예시를 알아보자.

// -> 접근 제어자와 캡슐화를 통해 데이터를 안전하게 보호하는 것은 물론이고, BankAccount를 사용하는 개발자 입장에서 입장에서 해당 기능을 사용하는 복잡도도 낮출 수 있다.


package Java_Basic.access.example.bank;

/**
 * BankAccount 클래스는 접근 제어자를 활용한 캡슐화의 예시입니다.
 * - private: 계좌 잔액은 외부에서 직접 접근할 수 없음
 * - public: 입금, 출금 등의 기능은 외부에서 접근 가능
 */
public class BankAccount {
    private int balance;  // 계좌 잔액은 private으로 보호
    private String accountNumber;  // 계좌번호도 private으로 보호
    
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    
    // public 메서드로 입금 기능 제공
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다.");
            System.out.println("현재 잔액: " + balance + "원");
        } else {
            System.out.println("잘못된 입금 금액입니다.");
        }
    }
    
    // public 메서드로 출금 기능 제공
    public boolean withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
            System.out.println("현재 잔액: " + balance + "원");
            return true;
        } else {
            System.out.println("잔액이 부족하거나 잘못된 출금 금액입니다.");
            return false;
        }
    }
    
    // public 메서드로 잔액 확인 기능 제공
    public int getBalance() {
        return balance;
    }
    
    // public 메서드로 계좌번호 확인 기능 제공
    public String getAccountNumber() {
        return accountNumber;
    }
}
