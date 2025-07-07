import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex85 {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        try (FileInputStream inputStream = new FileInputStream(sourceFilePath);
                FileOutputStream outputStream = new FileOutputStream(destinationFilePath)) {

            byte[] buffer = new byte[1024]; // 버퍼 크기
            int bytesRead;

            // 파일을 읽고 쓰는 루프
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
