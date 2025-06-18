public class Example19 {
    public static void main(String[] args) {
        int[] scores = { 90, 85, 78, 92, 88 };

        int max = findMax(scores);
        int min = findMin(scores);

        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);

    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

}
