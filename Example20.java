public class Example20 {
    public static void main(String[] args) {
        int[] scores = { 90, 85, 78, 92, 88 };

        int count = countOver80(scores);
        System.out.println("80점 이상인 학생 수: " + count);
    }

    private static int countOver80(int[] arr) {
        int count = 0;
        for (int score : arr) {
            if (score >= 80) {
                count++;
            }
        }
        return count;
    }

}
