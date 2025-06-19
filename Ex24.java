import java.util.ArrayList;
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Person> people = new ArrayList<>();

            System.out.println("사람 정보를 입력하세요. 종료하려면 q를 입력하세요.");
            // while (true) {
            // System.out.print("이름: ");
            // String name = scanner.nextLine();
            // if (name.equalsIgnoreCase("q"))
            // break;

            // System.out.print("나이: ");
            // int age = scanner.nextInt();
            // scanner.nextLine();

            // people.add(new Person(name, age));
            // }
            while (true) {
                System.out.print("이름: ");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("q"))
                    break;

                System.out.print("나이: ");
                String ageInput = scanner.nextLine();
                if (ageInput.equalsIgnoreCase("q"))
                    break;

                int age;
                try {
                    age = Integer.parseInt(ageInput);
                } catch (NumberFormatException e) {
                    System.out.println("나이는 숫자로 입력해주세요.");
                    continue; // 다시 입력 받기
                }

                people.add(new Person(name, age));
            }

            // 전체정보 출력
            System.out.println("\n입력된 사람들의 정보: ");
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