import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            String input;           
            do{
                System.out.print("문장을 입력하세요(종료하려면 exit 입력): ");
                input = scanner.nextLine();
                System.out.println("입력한 내용: "+input);
            }while(!input.equals("exit"));
        }
    }
}
