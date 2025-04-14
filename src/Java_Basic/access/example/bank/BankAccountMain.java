package Java_Basic.access.example.bank;

public class BankAccountMain {
    public static void main(String[] args) {
        // 계좌 생성
        BankAccount account = new BankAccount("123-456-789");
        
        // 계좌 기본 정보 확인
        System.out.println("계좌번호: " + account.getAccountNumber());
        System.out.println("최초 잔액: " + account.getBalance() + "원");
        
        // 입금 테스트
        account.deposit(10000);
        account.deposit(-1000);  // 잘못된 입금 시도
        
        // 출금 테스트
        account.withdraw(3000);
        account.withdraw(100000);  // 잔액 부족 시도
        
        // 잔액 확인
        System.out.println("최종 잔액: " + account.getBalance() + "원");
        
        // private 필드 직접 접근 시도 (컴파일 에러)
        // account.balance = 1000000;  // ❌ private 필드 접근 불가
        // account.accountNumber = "999-999-999";  // ❌ private 필드 접근 불가
    }
}
