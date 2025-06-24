import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex58 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("문장을 입력하세요:");
            String sentence = scanner.nextLine();

            // 정규표현식: 정수 또는 소수 추출
            Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
            Matcher matcher = pattern.matcher(sentence);

            System.out.println("숫자들:");
            while (matcher.find()) {
                System.out.println("- " + matcher.group());
            }
        }
    }
}