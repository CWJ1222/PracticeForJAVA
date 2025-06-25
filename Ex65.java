import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("문자열을 입력하세요: ");
            String input = scanner.nextLine();

            boolean isPalindrome = checkPalindrome(input);
            if (isPalindrome) {
                System.out.println("회문입니다.");
            } else {
                System.out.println("회문이 아닙니다.");
            }
        }
    }

    // private static boolean checkPalindrome(String str) {
    // str = str.replaceAll("\\s+", "").toLowerCase(); // 공백 제거 + 소문자화
    // int left = 0;
    // int right = str.length() - 1;

    // while (left < right) {
    // if (str.charAt(left) != str.charAt(right)) {
    // return false;
    // }
    // left++;
    // right--;
    // }

    // return true;
    // }

    private static boolean checkPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}