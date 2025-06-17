import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\n===== 메뉴 =====");
                System.out.println("1. 인사 출력");
                System.out.println("2. 덧셈 계산");
                System.out.println("3. 종료");
                System.out.print("메뉴를 선택하세요: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> System.out.println("안녕하세요 반갑습니다~");
                    case 2 -> {
                        System.out.println("처음 숫자를 입력하시오: ");
                        int a = scanner.nextInt();
                        System.out.println("두번째 숫자를 입력하시오: ");
                        int b = scanner.nextInt();
                        System.out.println("결과: " + (a + b));
                    }
                    case 3 -> System.out.println("프로그램을 종료합니다");
                    default -> System.out.println("잘못된 선택입니다 다시 입력하시오");
                } // switch 문 종료
            } while (choice != 3); // do-while 종료
        } // try-with-resources 종료
    } // main 메서드 종료
}