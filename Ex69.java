import java.util.Scanner;

public class Ex69 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("문장을 입력하세요: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("가장 긴 단어: (입력 없음)");
                return;
            }

            String[] words = input.split("\\s+");
            String longest = words[0];

            for (String word : words) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }

            System.out.println("가장 긴 단어: " + longest);
            System.out.println("길이: " + longest.length());
        }
    }
}