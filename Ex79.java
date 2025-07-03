public class Ex79 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // 0으로 나누기 예외 발생
            System.out.println("결과: " + result); // 실행되지 않음
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace();
        } finally {
            System.out.println("finally 블록 실행"); // 항상 실행
        }
    }
}
