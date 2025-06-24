import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("문장을 입력하세요: ");
            String sentence = scanner.nextLine();

            String[] words = sentence.trim().split("\\s+");

            List<String> longestWords = new ArrayList<>();
            int maxLength = 0;

            for (String word : words) {
                int len = word.length();
                if (len > maxLength) {
                    maxLength = len;
                    longestWords.clear();
                    longestWords.add(word);
                } else if (len == maxLength) {
                    longestWords.add(word);
                }
            }

            System.out.println("가장 긴 단어들 (길이: " + maxLength + "):");
            for (String w : longestWords) {
                System.out.println("- " + w);
            }
        }
    }
}
