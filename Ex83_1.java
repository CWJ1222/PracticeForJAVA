import java.util.ArrayList;

public class Ex83_1 {
    public static void main(String[] args) {
        // ArrayList 생성
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("사과");
        list.add("바나나");
        list.add("오렌지");

        // 데이터 출력
        System.out.println("ArrayList 내용: " + list);

        // 특정 인덱스의 요소 접근
        String fruit = list.get(1);
        System.out.println("인덱스 1의 요소: " + fruit);

        // 요소 수정
        list.set(1, "키위");
        System.out.println("수정 후 ArrayList 내용: " + list);

        // 요소 삭제
        list.remove("오렌지");
        System.out.println("삭제 후 ArrayList 내용: " + list);
    }
}
