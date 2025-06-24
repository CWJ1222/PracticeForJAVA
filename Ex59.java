import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex59 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("문장을 입력하세요:");
            String sentence = scanner.nextLine();

            // 이메일 주소 패턴
            Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
            Matcher matcher = pattern.matcher(sentence);

            System.out.println("이메일 주소:");
            while (matcher.find()) {
                System.out.println("- " + matcher.group());
            }

        }
    }
}
