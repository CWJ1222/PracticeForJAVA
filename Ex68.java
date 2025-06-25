import java.util.Scanner;

public class Ex68 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("문장을 입력하세요: ");
            String input = scanner.nextLine().trim(); // 앞뒤 공백 제거

            if (input.isEmpty()) {
                System.out.println("단어 수: 0");
                return;
            }

            String[] words = input.split("\\s+"); // 하나 이상의 공백으로 구분
            System.out.println("단어 수: " + words.length);
        }
    }
}
