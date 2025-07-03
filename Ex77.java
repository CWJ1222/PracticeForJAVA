import java.util.function.Predicate;

public class Ex77 {
    public static void main(String[] args) {
        // 람다 표현식으로 짝수 판별
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("10은 짝수인가? " + isEven.test(10));
        System.out.println("7은 짝수인가? " + isEven.test(7));
    }
}
