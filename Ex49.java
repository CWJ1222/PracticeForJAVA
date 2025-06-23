import java.util.HashMap;

public class Ex49 {
    public static void main(String[] args) {
        String sentence = "Java is Java";

        // 문자별 등장 횟수를 저장할 맵
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // 공백 제외(원하면 제거하지 않아도 됨)
            if (ch == ' ')
                continue;

            // 이미 있으면 +1, 없으면 1로 시작
            if (countMap.containsKey(ch)) {
                countMap.put(ch, countMap.get(ch) + 1);
            } else {
                countMap.put(ch, 1);
            }
        }

        // 결과 출력
        System.out.println("문자열 등장 횟수:");
        for (char key : countMap.keySet()) {
            System.out.println("'" + key + "' : " + countMap.get(key));

        }
    }
}
