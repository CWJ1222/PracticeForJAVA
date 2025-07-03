import java.io.FileWriter;
import java.io.IOException;

public class Ex72 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt", true);
            writer.write("파일에 쓰는 내용입니다.\n");
            writer.write("Java 예제입니다.\n");
            writer.close();
            System.out.println("파일에 성공적으로 썼습니다.");
        } catch (IOException e) {
            System.out.println("파일 쓰기에 실패했습니다.");
            e.printStackTrace();
        }
    }
}
