import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("문장을 입력하세요:");

            String sentence = scanner.nextLine();

            // 공백 기준으로 단어 분리
            String[] words = sentence.trim().split("\\s+");

            String longestWord = "";
            int maxLength = 0;

            for (String word : words) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                    longestWord = word;
                }
            }

            System.out.println("가장 긴 단어: '" + longestWord + "' (길이: " + maxLength + ")");

        }
    }
}
