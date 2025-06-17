public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        // 2행 3열짜리 2차원 배열 선언 및 초기화
        int[][] numbers = {
                { 1, 2, 3 }, { 4, 5, 6 }
        };

        // 배열출력
        for (int i = 0; i < numbers.length; i++) { // 행 반복
            for (int j = 0; j < numbers[i].length; j++) { // 열 반복
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // 줄바꿈
        }
    }
}
