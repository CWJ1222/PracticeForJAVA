import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex74 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 7, 10, 2, 4, 1, 8);

        // 짝수만 필터링하고 제곱하여 리스트로 반환
        List<Integer> evenSquares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("짝수 제곱: " + evenSquares);
    }
}
