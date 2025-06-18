public class Example17 {
    public static void main(String[] args) {
        int[] scores = { 90, 85, 78, 92, 88 };
        // int total = sumArray(scores);
        // System.out.println("총합: " + total);

        System.out.println("총합: " + sumArray(scores));
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

}
