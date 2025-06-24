import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("문장을 입력하세요");
            String sentence = scanner.nextLine();

            // 소문자로 변환 + 공백 기준 분리
            String[] words = sentence.toLowerCase().trim().split("\\s+");

            // 단어 빈도 수 저장할 앱
            Map<String, Integer> wordCount = new HashMap<>();

            for (String word : words) {
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }

            // 결과출력
            System.out.println("단어별 등장 횟수:");
            for (String key : wordCount.keySet()) {
                System.out.println("'" + key + "': " + wordCount.get(key));
            }
        }
    }
}
