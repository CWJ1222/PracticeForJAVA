public class Ex33 {
    public static void main(String[] args) {
        int[] numbers = { 23, 7, 89, 15, 42, 3, 67 };

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최솟값: " + min);
    }
}
