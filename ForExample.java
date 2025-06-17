// public class ForExample {
//      public static void main(String[] args) {
//         // 1부터 10까지 출력
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("숫자: " + i);
//         }
//     }
// }

public class ForExample{
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<= 10; i++){
            sum = sum+i;

        }
        System.out.println("1부터 10까지의 합: "+sum);
    }
    
}