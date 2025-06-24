import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문장을 입력하세요");
        String input = scanner.nextLine();

        // 입력 문자열을 공백 기준으로 나눠서 배열로 저장.
        String[] words = input.trim().split("\\s+");

        System.out.println("단어개수: " + words.length);

        scanner.close();
    }
}
