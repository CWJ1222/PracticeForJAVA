import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("문자열을 입력하세요: ");
            String input = scanner.nextLine();

            int upperCount = 0;
            int lowerCount = 0;
            int digitCount = 0;
            int otherCount = 0;

            for (char ch : input.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    upperCount++;
                } else if (Character.isLowerCase(ch)) {
                    lowerCount++;
                } else if (Character.isDigit(ch)) {
                    digitCount++;
                } else {
                    otherCount++;
                }
            }
            System.out.println("대문자 수: " + upperCount);
            System.out.println("소문자 수: " + lowerCount);
            System.out.println("숫자 수: " + digitCount);
            System.out.println("기타 문자 수: " + otherCount);
        }
    }
}
