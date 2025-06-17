import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("이름을 입력하세요: ");
            String name = scanner.nextLine();

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();

            System.out.print("키를 입력하세요(cm): ");
            double height = scanner.nextDouble();

            System.out.println("----- 입력한 정보 -----");
            System.out.println("이름: " + name);
            System.out.println("나이: " + age);
            System.out.println("키: " + height + "cm");
        }
        // scanner.close() 불필요 — 자동으로 닫힘
    }
}