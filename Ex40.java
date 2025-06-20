public class Ex40 {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "cat", "application", "go", "grapefruit", "hi", "orange"
        };

        int minLength = 6;
        int count = 0;

        for (String word : words) {
            if (word.length() >= minLength) {
                count++;
            }
        }
        System.out.println(minLength + "글자 이상인 단어 개수: " + count);

    }
}
