import java.util.Scanner;

public class Ex67 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("압축된 문자열을 입력하세요: ");
            String input = scanner.nextLine().replaceAll("\\s+", ""); // 공백 제거

            String decompressed = decompressString(input);
            System.out.println("복원된 문자열: " + decompressed);
        }
    }

    private static String decompressString(String str) {
        StringBuilder result = new StringBuilder();
        char ch = 0;
        StringBuilder countBuilder = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) || c == '[' || c == ']' || c == '{' || c == '}' || c == '(' || c == ')') {
                if (countBuilder.length() > 0 && ch != 0) {
                    int count = Integer.parseInt(countBuilder.toString());
                    result.append(String.valueOf(ch).repeat(count));
                    countBuilder.setLength(0);
                }
                ch = c;
            } else if (Character.isDigit(c)) {
                countBuilder.append(c);
            }
        }

        // 마지막 문자 처리
        if (countBuilder.length() > 0 && ch != 0) {
            int count = Integer.parseInt(countBuilder.toString());
            result.append(String.valueOf(ch).repeat(count));
        }

        return result.toString();
    }
}