import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // // 몇명 입력받을지 정함.
        // System.out.print("몇명의 정보를 입력하시겠습니까?");
        // int count = scanner.nextInt();
        // scanner.nextLine();

        // // Person 배열 생성
        // Person[] people = new Person[count];

        // // 사용자로부터 입력받아 객체 생성
        // for (int i = 0; i < count; i++) {
        // System.out.println((i + 1) + "번째 사람 정보 입력");
        // System.out.print("이름: ");
        // String name = scanner.nextLine();
        // System.out.print("나이: ");
        // int age = scanner.nextInt();
        // scanner.nextLine();

        // people[i] = new Person(name, age);
        // }

        // // 전체정보 출력
        // System.out.println("\n입력된 사람들의 정보");
        // for (Person person : people) {
        // person.introduce();
        // }
        // scanner.close();

        try (Scanner scanner = new Scanner(System.in)) {

            // 몇명 입력받을지 정함.
            System.out.print("몇명의 정보를 입력하시겠습니까?");
            int count = scanner.nextInt();
            scanner.nextLine();

            // Person 배열 생성
            Person[] people = new Person[count];

            // 사용자로부터 입력받아 객체 생성
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + "번째 사람 정보 입력");
                System.out.print("이름: ");
                String name = scanner.nextLine();
                System.out.print("나이: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                people[i] = new Person(name, age);
            }

            // 전체정보 출력
            System.out.println("\n입력된 사람들의 정보");
            for (Person person : people) {
                person.introduce();
            }
        }

    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    void introduce() {
        System.out.println("안녕하세요, 제 이름은 " + name + "이고 나이는 " + age + "살입니다.");
    }
}