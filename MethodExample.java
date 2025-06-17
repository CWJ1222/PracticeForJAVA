public class MethodExample {
    public static void main(String[] args) {
        int result = add(10, 20); // 메서드 호출
        double result2 = multiply(23, 56);
        System.out.println("결과1: " + result);
        System.out.println("결과2: " + result2);
    }

    // 두수를 더해서 반환하는 메서드 정의
    public static int add(int a, int b) {
        return a + b;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }
}
