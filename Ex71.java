import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex71 {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt"); // 파일 이름 지정
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        }
    }
}