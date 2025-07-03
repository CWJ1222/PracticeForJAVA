import java.util.ArrayList;
import java.util.List;

public class Ex78 {
    public static void main(String[] args) {
        // String 타입을 저장하는 제네릭 리스트
        List<String> stringList = new ArrayList<>();
        stringList.add("사과");
        stringList.add("바나나");
        // stringList.add(123); // 컴파일 오류 발생

        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }
}
