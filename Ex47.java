import java.util.Arrays;

public class Ex47 {
    public static void main(String[] args) {
        String sentence = "Java is a powerful language";

        // 공백을 기준으로 단어 분리
        String[] words = sentence.split(" ");

        // 단어 배열 정렬(오름차순)
        Arrays.sort(words);
        System.out.println("정렬된 단어 목록: ");
        for (String word : words) {
            System.out.println("- " + word);
        }
    }
}
