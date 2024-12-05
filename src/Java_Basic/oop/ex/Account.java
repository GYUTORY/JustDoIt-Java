// TIL : 객체지향 프로그래밍 - 문제와 풀이

package Java_Basic.oop.ex;

public class Account {

    // 잔액
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if(balance < amount) {
            System.out.println("잔액 부족");
            System.out.println("잔고: " + balance);
            return;
        }
        balance -= amount;
    }

}
