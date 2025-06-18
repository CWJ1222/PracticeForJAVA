public class Example18 {
    public static void main(String[] args) {
        int[] scores = { 90, 85, 78, 92, 88 };
        double average = calculateAverage(scores);
        System.out.println("평균: " + average);
    }

    private static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        return (double) sum / arr.length;
    }
}
