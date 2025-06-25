import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("문자열을 입력하세요: ");
            String input = scanner.nextLine();

            String reversed = reverseString(input);
            System.out.println("뒤집은 문자열: " + reversed);
        }
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString(); // StringBuilder reverse() 메서드 사용
    }
}
