import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex57 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("문장을 입력하세요:");
            String sentence = scanner.nextLine();

            // 정규표현식: 연속된 알파벳 단어
            Pattern pattern = Pattern.compile("[a-zA-Z]+");
            Matcher matcher = pattern.matcher(sentence);

            System.out.println("알파벳 단어들: ");
            while (matcher.find()) {
                System.out.println("- " + matcher.group());
            }
        }
    }
}
