import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("문장을 입력하시오");
            String sentence = scanner.nextLine();

            // 소문자로 변환 + 공백기준분리
            String[] words = sentence.toLowerCase().trim().split("\\s+");

            Map<String, Integer> wordCount = new HashMap<>();

            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            // 가장 많이 등장한 단어 찾기
            String mostFrequentWord = "";
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFrequentWord = entry.getKey();
                }
            }
            System.out.println("가장 많이 등장한 단어: '" + mostFrequentWord + "' (" + maxCount + "회)");

        }
    }
}
