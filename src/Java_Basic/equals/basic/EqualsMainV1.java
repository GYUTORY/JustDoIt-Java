// TIL - Java_Basic.equals() - 1. 동일성과 동등성

package Java_Basic.equals.basic;

import Java_Basic.equals.user.UserV1;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + (user1.equals(user2)));

    }
}
