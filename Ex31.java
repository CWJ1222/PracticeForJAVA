import java.util.Arrays;

public class Ex31 {
    public static void main(String[] args) {
        String[] fruits = { "banana", "Apple", "Mango", "Cherry", "Orange" };

        // 정렬 전 출력
        System.out.println("정렬 전:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 오름차순 정렬(기본 compareTo 기준)
        Arrays.sort(fruits); // 내부적으로 compareTo 사용

        // 정렬 후 출력
        System.out.println("\n정렬 후:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
