public class ArrayExample {
    public static void main(String[] args) {
        // 정수형 배열 선언 및 초기화
        int[] numbers = { 10, 20, 30, 40, 50 };

        // 배열의 길이 출력
        System.out.println("배열 길이: " + numbers.length);

        // 배열의 요소를 하나씩 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
