// TIL : 생성자

package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 인스턴스를 생성하고 즉시 해당 생성자를 호출한다. 여기서는 Member 인스턴스를 생성하고 바로 MemberConstruct(String name, int age, int grade) 생성자를 호출한다.
        // -> new 키워드를 사용해서 객체를 생성할 때 마지막에 괄호 ()도 포함해야 하는 이유가 바로 생성자 때문이다.
        // 객체를 생성하면서 동시에 생성자를 호출한다는 의미를 포함한다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct [] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름:" + member.name + " 나이:" + member.age + "성적:" + member.grade);
        }
    }
}
