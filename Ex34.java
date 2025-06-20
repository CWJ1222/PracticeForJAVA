public class Ex34 {
    public static void main(String[] args) {
        int[] scores = { 85, 90, 70, 92, 88 };

        int total = 0;
        for (int score : scores) {
            total += score;
        }

        double average = (double) total / scores.length;

        System.out.println("총합: " + total);
        System.out.println("평균: " + average);

    }
}
