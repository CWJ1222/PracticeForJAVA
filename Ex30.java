import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Person> people = new ArrayList<>();

            System.out.println("사람 정보를 입력하세요. 종료하려면 'q'를 입력하세요.");

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
                    continue;
                }

                people.add(new Person(name, age));
            }

            if (people.isEmpty()) {
                System.out.println("입력된 사람이 없습니다.");
                return;
            }

            // 정렬 기준 선택
            System.out.println("\n정렬 기준을 선택하세요:");
            System.out.println("1. 이름순");
            System.out.println("2. 나이순");
            System.out.print("번호 입력: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    people.sort(Comparator.comparing(p -> p.name));
                    System.out.println("\n[이름순 정렬 결과]");
                    break;
                case "2":
                    people.sort(Comparator.comparingInt(p -> p.age));
                    System.out.println("\n[나이순 정렬 결과]");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 정렬 없이 출력합니다.");
            }

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