import java.util.HashSet;

public class Ex83_3 {
    public static void main(String[] args) {
        // HashSet 생성
        HashSet<String> set = new HashSet<>();

        // 데이터 추가
        set.add("사과");
        set.add("바나나");
        set.add("오렌지");
        set.add("바나나"); // 중복된 요소는 저장되지 않음

        // 데이터 출력
        System.out.println("HashSet 내용: " + set);

        // 특정 요소 존재 여부 확인
        boolean containsBanana = set.contains("바나나");
        System.out.println("'바나나'가 포함되어 있는지: " + containsBanana);

        // 요소 제거
        set.remove("오렌지");
        System.out.println("삭제 후 HashSet 내용: " + set);
    }
}
