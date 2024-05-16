package Scanner.ex;


/*
**풀이**
`a` 와 `b` 를한번에서로교환할수는없다.
`a = b` 라고하면 `a` 의값인10은사라져버린다.따라서 `a` , `b` 둘다 20이 되어버린다.
`a = b` 라고하기전에 `a` 의값을어딘가에보관해두어야한다.여기서는임시로사용할변수인 `temp`에 보관해두었다.
*/

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        //시작 : 코드를 작성하세요
        temp = a;
        a = b;
        b = temp;


        //종료 : 코드를 작성하세요

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
