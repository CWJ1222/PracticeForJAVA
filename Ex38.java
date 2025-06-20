public class Ex38 {
    public static void main(String[] args) {
        String[] words = {
                "application", "banana", "appetite", "happy", "grape", "append", "apple", "orange"
        };
        String prefix = "app";
        int count = 0;

        for (String word : words) {
            if (word.startsWith(prefix)) {
                count++;
            }
        }
        System.out.println("'" + prefix + "'로 시작하는 단어 개수: " + count);

    }
}
