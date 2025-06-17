import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();

            if (age < 13) {
                System.out.println("어린이입니다.");
            } else if (age < 20) {
                System.out.println("청소년입니다.");
            } else if (age < 65) {
                System.out.println("성인입니다.");
            } else {
                System.out.println("노년층입니다.");
            }
        }
    }
}