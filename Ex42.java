public class Ex42 {
    public static void main(String[] args) {
        String original = "Hello Java";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); // 뒤에서부터 문자 추가
        }

        System.out.println("원본 문자열" + original);
        System.out.println("뒤집은 문자열" + reversed);
    }
}
