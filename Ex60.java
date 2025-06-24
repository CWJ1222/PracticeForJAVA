import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex60 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("문장을 입력하세요:");
            String sentence = scanner.nextLine();

            // URL 추출 정규표현식
            Pattern pattern = Pattern.compile("(https?://[\\w.-]+(?:\\.[a-zA-Z]{2,})(?:/[\\w./?%&=-]*)?)");
            Matcher matcher = pattern.matcher(sentence);

            System.out.println("추출된 URL:");
            while (matcher.find()) {
                System.out.println("- " + matcher.group());
            }
        }
    }
}
