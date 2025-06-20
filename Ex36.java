public class Ex36 {
    public static void main(String[] args) {
        String[] words = { "apple", "banana", "avocado", "grape", "apricot", "orange" };
        char targetChar = 'p';
        int count = 0;
        for (String word : words) {
            if (word.contains(String.valueOf(targetChar))) {
                count++;
            }
        }
        System.out.println("'" + targetChar + "' 문자가 포함된 단어 개수: " + count);
    }
}
