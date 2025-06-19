public class Ex21 {
    public static void main(String[] args) {
        // Person 객체 생성
        Person person1 = new Person("홍길동", 30);
        Person person2 = new Person("김영희", 25);

        // 객체 정보 출력
        person1.introduce();
        person2.introduce();

    }
}

class Person {
    String name;
    int age;

    // 생성자
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 자기소개 메서드
    void introduce() {
        System.out.println("안녕하세요 제 이름은 " + name + "이고 나이는 " + age + "살입니다.");
    }
}
