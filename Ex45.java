public class Ex45 {
    public static void main(String[] args) {
        String sentence = "Java는 객체지향 프로그래밍 언어입니다.";

        boolean hasJava = sentence.contains("Java");
        boolean hasPython = sentence.contains("Python");

        System.out.println("문장: " + sentence);
        System.out.println("\"Java\" 포함여부: " + hasJava);
        System.out.println("\"Python\" 포함여부: " + hasPython);

    }
}
