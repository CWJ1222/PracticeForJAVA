import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex61 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("문자열을 입력하세요: ");
            String input = scanner.nextLine();

            String[] result = removeDuplicateCharacters(input);
            System.out.println("중복 제거 결과: " + result[0]);
            System.out.println("제거된 문자들: " + result[1]);
        }
    }

    private static String[] removeDuplicateCharacters(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        Set<Character> removed = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) {
                removed.add(ch);
            } else {
                seen.add(ch);
                sb.append(ch);
            }
        }
        StringBuilder removedStr = new StringBuilder();
        for (char ch : removed) {
            removedStr.append(ch);
        }
        return new String[] { sb.toString(), removedStr.toString() };
    }
}
