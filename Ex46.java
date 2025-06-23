public class Ex46 {
    public static void main(String[] args) {
        String sentence = "Java is a powerful language";
        // 공백을 기준으로 문자열 자르기
        String[] words = sentence.split(" ");

        System.out.println("원본문장: " + sentence);
        System.out.println("단어목록: ");
        for (String word : words) {
            System.out.println("- " + word);
        }

    }
}
