import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("문자열을 입력하세요: ");
            String input = scanner.nextLine();
            input = input.replaceAll("\\s+", "");

            String compressed = compressString(input);
            System.out.println("압축된 문자열: " + compressed);
        }
    }

    private static String compressString(String str) {
        if (str.isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();
        char prevChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == prevChar) {
                count++;
            } else {
                sb.append(prevChar).append(count);
                prevChar = current;
                count = 1;
            }
        }

        // 마지막 문자 처리
        sb.append(prevChar).append(count);
        return sb.toString();
    }
}