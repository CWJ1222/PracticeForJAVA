public class StringArrayExample {
    public static void main(String[] args) {
        // 문자열 배열 선언 및 초기화
        String[] names = { "abv", "eee", "gugu", "oijk", "vuuc" };

        // 배열길이 출력
        System.out.println("이름목록(" + names.length + "명):");

        // 배열 요소출력
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
    }
}
