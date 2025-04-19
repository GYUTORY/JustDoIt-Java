// TIL - Java_Basic.equals() - 2. 구현

package Java_Basic.equals.basic;

import Java_Basic.equals.user.UserV2;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + (user1.equals(user2)));

    }
}
