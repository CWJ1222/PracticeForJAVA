import java.util.Scanner;

public class ArrayAverageExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] scores = new int[5];
            int sum = 0;

            for (int i = 0; i < scores.length; i++) {
                System.out.println((i + 1) + "번째 점수를 입력하시오");
                scores[i] = scanner.nextInt();
                sum = sum + scores[i];
            }

            double average = (double) sum / scores.length;
            // 결과출력

            System.out.println("총합: " + sum);
            System.out.println("평균: " + average);
        }
    }
}
