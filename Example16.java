public class Example16 {
    public static void main(String[] args) {
        int[] scores = { 90, 85, 78, 92, 88 };
        printArray(scores);
    }

    public static void printArray(int[] arr) {
        System.out.println("점수목록: ");
        for (int score : arr) {
            System.out.println(score);
        }
    }

}
