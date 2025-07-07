import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex88 {
    public static void main(String[] args) {
        // List 생성 및 초기화
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Predicate: 조건을 검사하는 함수형 인터페이스 (예: 이름의 길이가 4 이상인 것)
        Predicate<String> nameLengthPredicate = name -> name.length() > 4;

        // Consumer: 값을 받아 처리하지 않고 반환값은 없는 함수형 인터페이스 (예: 이름 출력하기)
        Consumer<String> printNameConsumer = name -> System.out.println(name);

        // Function: 입력을 받아 출력을 반환하는 함수형 인터페이스 (예: 이름의 길이를 반환하기)
        Function<String, Integer> getNameLengthFunction = String::length;

        // Predicate를 사용하여 조건에 맞는 이름 필터링
        System.out.println("Names with length greater than 4:");
        for (String name : names) {
            if (nameLengthPredicate.test(name)) {
                printNameConsumer.accept(name);
            }
        }

        // Function을 사용하여 각 이름의 길이를 반환하고 출력
        System.out.println("Lengths of each name:");
        for (String name : names) {
            int length = getNameLengthFunction.apply(name);
            System.out.println("The length of \"" + name + "\" is " + length);
        }
    }
}
