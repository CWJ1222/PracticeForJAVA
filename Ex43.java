public class Ex43 {
    public static void main(String[] args) {
        String original = "  Java   is   fun  ";
        String noSpaces = original.replace(" ", "");
        String REP = original.replaceAll("\\s+", "");

        System.out.println("원본 문자열: " + original);
        System.out.println("공백 제거 문자열: " + noSpaces);
        System.out.println("모든 공백 제거 문자열: " + REP);

    }
}
