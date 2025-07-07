import java.util.ArrayList;
import java.util.List;

public class Ex89 {
    public static void main(String[] args) {
        // List 생성 및 초기화
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

        System.out.println("Original List: " + numbers);

        // Filter: 짝수만 필터링
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even Numbers: " + evenNumbers);

        // Map: 각 숫자의 제곱으로 매핑
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println("Squared Numbers: " + squaredNumbers);

        // Sorted: 정렬
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();
        System.out.println("Sorted Numbers: " + sortedNumbers);

        // Reduce: 합계 계산
        int sumOfNumbers = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of Numbers: " + sumOfNumbers);

        // Count: 요소 개수 세기
        long countOfEvenNumbers = evenNumbers.stream()
                .count();
        System.out.println("Count of Even Numbers: " + countOfEvenNumbers);

        // AnyMatch, AllMatch, NoneMatch
        boolean anyGreaterThanTen = numbers.stream()
                .anyMatch(n -> n > 10);
        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);
        boolean noneNegative = numbers.stream()
                .noneMatch(n -> n < 0);

        System.out.println("Any number greater than 10? " + anyGreaterThanTen);
        System.out.println("All numbers even? " + allEven);
        System.out.println("None of the numbers are negative? " + noneNegative);
    }
}
