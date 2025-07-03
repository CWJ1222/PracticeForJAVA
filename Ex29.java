import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ex29 {
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

            // 이름 기준 오름차순 정렬
            // people.sort((p1, p2) -> p1.name.compareTo(p2.name));
            people.sort(Comparator.comparing(p -> p.name));

            System.out.println("\n이름순으로 정렬된 사람 목록:");
            for (Person person : people) {
                person.introduce();
            }
        }
    }
}

class Person44 {
    String name;
    int age;

    Person44(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("안녕하세요, 제 이름은 " + name + "이고 나이는 " + age + "살입니다.");
    }
}