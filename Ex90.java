// 사용자 정의 예외 클래스 정의
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Ex90 {
    public static void main(String[] args) {
        try {
            // 예외가 발생할 수 있는 메서드 호출
            checkAge(15);
        } catch (CustomException e) {
            // 사용자 정의 예외 처리
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
