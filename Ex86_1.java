// import java.util.HashMap;
// import java.util.Map;
// import java.lang.reflect.Field;

// class User {
//     private String name;
//     private int age;
// }

// public class Ex86_1 {
//     public static void main(String[] args) throws Exception {
//         // JSON 형식의 데이터를 Map으로 가정
//         Map<String, Object> jsonMap = new HashMap<>();
//         jsonMap.put("name", "철수");
//         jsonMap.put("age", 25);

//         // User 객체 생성
//         Class<?> clazz = Class.forName("User");
//         Object obj = clazz.getDeclaredConstructor().newInstance();

//         // 리플렉션으로 필드에 값을 설정
//         for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
//             Field field = clazz.getDeclaredField(entry.getKey());
//             field.setAccessible(true); // private 필드 접근 허용
//             field.set(obj, entry.getValue());
//         }

//         // 결과 출력
//         for (Field field : clazz.getDeclaredFields()) {
//             field.setAccessible(true);
//             System.out.println(field.getName() + ": " + field.get(obj));
//         }
//     }
// }
