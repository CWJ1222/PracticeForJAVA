public class Ex37 {
    public static void main(String[] args) {
        String[] words = {
                "application", "banana", "appetite", "happy", "grape", "append", "apple", "orange"
        };

        String keyword = "app";
        int count = 0;

        for (String word : words) {
            if (word.contains(keyword)) {
                count++;
            }
        }
        System.out.println("'" + keyword + "'가 포함된 단어 개수: " + count);

    }
}
