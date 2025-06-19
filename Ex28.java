import java.util.ArrayList;
import java.util.Scanner;

public class Ex28 {
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

            // 나이 기준 오름차순 정렬
            // Collections.sort(people, new Comparator<Person>() {

            // @Override
            // public int compare(Person p1, Person p2) {
            // return Integer.compare(p1.age, p2.age); // 오름차순
            // }
            // });
            people.sort((p1, p2) -> Integer.compare(p1.age, p2.age));

            System.out.println("\n나이순으로 정렬된 사람 목록:");
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