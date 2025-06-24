import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문장을 입력하세요.");
        String sentence = scanner.nextLine();

        System.out.println("찾을 단어를 입력하세요");
        String target = scanner.nextLine();

        // 소문자로 변환하여 대소문자 구분 없이 비교
        String[] words = sentence.toLowerCase().trim().split("\\s+");
        String targetLower = target.toLowerCase();

        int count = 0;
        for (String word : words) {
            if (word.equals(targetLower)) {
                count++;
            }
        }

        System.out.println("단어 '" + target + "'의 등장 횟수: " + count);

        scanner.close();
    }
}
