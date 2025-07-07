import java.util.HashMap;

public class Ex83_4 {
    public static void main(String[] args) {
        // HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("사과", 10);
        map.put("바나나", 20);
        map.put("오렌지", 30);

        // 데이터 출력
        System.out.println("HashMap 내용: " + map);

        // 특정 키의 값 가져오기
        Integer appleCount = map.get("사과");
        System.out.println("'사과'의 수량: " + appleCount);

        // 요소 수정
        map.put("바나나", 25);
        System.out.println("수정 후 HashMap 내용: " + map);

        // 키 존재 여부 확인
        boolean hasOrange = map.containsKey("오렌지");
        System.out.println("'오렌지'가 키로 존재하는지: " + hasOrange);

        // 요소 제거
        map.remove("오렌지");
        System.out.println("삭제 후 HashMap 내용: " + map);
    }
}
