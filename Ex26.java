import java.util.ArrayList;
import java.util.Scanner;

public class Ex26 {
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

            System.out.print("\n찾고싶은 이름 키워드를 입력하세요");
            String keyword = scanner.nextLine();

            System.out.println("\n[" + keyword + "]를 포함한 사람들:");
            for (Person person : people) {
                if (person.name.contains(keyword)) {
                    person.introduce();
                }
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