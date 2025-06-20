public class Ex39 {
    public static void main(String[] args) {
        String[] words = {
                "application", "caution", "station", "banana", "vacation", "grape", "nation", "orange"
        };
        String suffix = "ion";

        int count = 0;

        for (String word : words) {
            if (word.endsWith(suffix)) {
                count++;
            }
        }
        System.out.println("'" + suffix + "'로 끝나는 단어 개수: " + count);

    }
}
