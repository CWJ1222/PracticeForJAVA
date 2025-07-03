public class Ex22 {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Person("홍길동", 30);
        people[1] = new Person("김영희", 25);
        people[2] = new Person("이철수", 40);

        for (Person person : people) {
            person.introduce();
        }
    }
}

class Person232 {
    String name;
    int age;

    Person232(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("안녕하세요, 제 이름은 " + name + "이고 나이는 " + age + "살입니다.");
    }
}