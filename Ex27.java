import java.util.ArrayList;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Person> people = new ArrayList<>();

            System.out.println("사람 정보를 입력하시오. 종료하려면 q");

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
                    System.out.println("나이는 숫자로 입력하세요");
                    continue;
                }

                people.add(new Person(name, age));

            }

            System.out.print("\n이름에 포함될 키워드 입력하시오");
            String keyword = scanner.nextLine();

            System.out.print("최소 나이 기준을 입력하시오");
            String minAgeInput = scanner.nextLine();
            int minAge;

            try {
                minAge = Integer.parseInt(minAgeInput);
            } catch (NumberFormatException e) {
                System.out.println("나이는 숫자로 입력하세요. 기본값 0으로 처리함.");
                minAge = 0;
            }

            System.out.println("\n[" + keyword + "]를 포함하고 나이가 " + minAge + "세 이상인 사람들:");
            for (Person person : people) {
                if (person.name.contains(keyword) && person.age >= minAge) {
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
        System.out.println("My name is " + name + ", age is " + age);
    }
}