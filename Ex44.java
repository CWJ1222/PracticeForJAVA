public class Ex44 {
    public static void main(String[] args) {
        String mixed = "전화번호는 123-234-3455입니다.";

        // 숫자만 남기고 나머지는 모두 제거
        String onlyDigits = mixed.replaceAll("[^0-9]", "");

        System.out.println("원본문자열: " + mixed);
        System.out.println("숫자만 추출: " + onlyDigits);
    }
}
