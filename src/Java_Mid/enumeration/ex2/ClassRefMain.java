package Java_Mid.enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("Java_Basic.ref BASIC = " + ClassGrade.BASIC);
        System.out.println("Java_Basic.ref GOLD = " + ClassGrade.GOLD);
        System.out.println("Java_Basic.ref DIAMOND = " + ClassGrade.DIAMOND);
    }
}
