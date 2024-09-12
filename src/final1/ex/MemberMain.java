// TIL - final 정리

package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kang");
        member.print();
        member.changeData("seo");
        member.print();
    }
}
