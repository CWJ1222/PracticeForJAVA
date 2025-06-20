public class Ex35 {
    public static void main(String[] args) {
        int[] scores = { 85, 67, 90, 72, 88, 95, 60 };
        // int count = 0;

        // for (int score : scores) {
        // if (score >= 80) {
        // count++;
        // }
        // }
        // System.out.println("80점 이상인 점수의 개수" + count);

        int evenCount = 0;
        int oddCount = 0;

        for (int score : scores) {
            if (score % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("짝수개수: " + evenCount);
        System.out.println("홀수개수: " + oddCount);
    }
}
