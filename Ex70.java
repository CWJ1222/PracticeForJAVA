import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex70 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("문장을 입력하세요: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("입력 없음");
                return;
            }

            String[] words = input.split("\\s+");
            Set<String> uniqueWords = new LinkedHashSet<>();

            for (String word : words) {
                uniqueWords.add(word);
            }

            System.out.println("중복 제거된 단어들:");
            for (String word : uniqueWords) {
                System.out.print(word + " ");
            }
        }
    }
}