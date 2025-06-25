import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("문자열을 입력하세요: ");
            String input = scanner.nextLine().toLowerCase(); // 대소문자 통일

            Map<Character, Integer> countMap = countAlphabet(input);

            System.out.println("알파벳 개수:");
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (countMap.containsKey(ch)) {
                    System.out.println(ch + ": " + countMap.get(ch));
                }
            }
        }
    }

    private static Map<Character, Integer> countAlphabet(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        return map;
    }
}