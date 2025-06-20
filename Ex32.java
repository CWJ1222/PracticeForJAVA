import java.util.Arrays;

public class Ex32 {
    public static void main(String[] args) {
        String[] fruits = { "banana", "Apple", "Mango", "Cherry", "Orange" };

        // 정렬 전 출력
        System.out.println("정렬 전:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 내림차순 정렬
        Arrays.sort(fruits, (s1, s2) -> s2.compareTo(s1));

        // 정렬 후 출력
        System.out.println("\n정렬 후 (내림차순):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
