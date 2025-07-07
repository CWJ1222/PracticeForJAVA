import java.util.LinkedList;

public class Ex83_2 {
    public static void main(String[] args) {
        // LinkedList 생성
        LinkedList<String> linkedList = new LinkedList<>();

        // 데이터 추가
        linkedList.add("사과");
        linkedList.add("바나나");
        linkedList.add("오렌지");

        // 데이터 출력
        System.out.println("LinkedList 내용: " + linkedList);

        // 첫 번째 요소 추가
        linkedList.addFirst("복숭아");
        System.out.println("첫 번째로 '복숭아'를 추가한 후 LinkedList 내용: " + linkedList);

        // 마지막 요소 삭제
        linkedList.removeLast();
        System.out.println("마지막 요소를 삭제한 후 LinkedList 내용: " + linkedList);
    }
}
