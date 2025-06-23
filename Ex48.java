public class Ex48 {
    public static void main(String[] args) {
        String sentence = "Java is a powerful language";
        char targetChar = 'a'; // 세고싶은문자

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == targetChar) {
                count++;
            }
        }

        System.out.println("문장: " + sentence);
        System.out.println("'" + targetChar + "' 문자의 등장 횟수: " + count);
    }
}
